package ru.kolyasnikovkv.collectiondvd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.kolyasnikovkv.collectiondvd.dto.DvdDto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LongSummaryStatistics;


@Entity
@SqlResultSetMapping(
        name="mapDataInDto",
        classes = {
                @ConstructorResult(
                        targetClass= DvdDto.class,
                        columns = { @ColumnResult(name = "id", type = Long.class),
                                    @ColumnResult(name = "name", type = String.class) }
                )
        }
)
@NamedNativeQuery(
        name="findDataInDto",
        //query="SELECT id, name FROM collection_dvd where id = :id",
        query="SELECT id, name FROM collection_dvd limit 1",
        resultSetMapping="mapDataInDto"
)

/*@NamedQueries({
        @NamedQuery(name="Dvd.findAll", query="SELECT c from Dvd c")
})*/
@Table(name = "collection_dvd")
@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class Dvd extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;

    @Column(name = "date_time", nullable = false)
    @NotNull
   // @DateTimeFormat(pattern = DateTimeUtil.DATE_TIME_PATTERN)
    private LocalDateTime dateTime;

    @Column(name = "description", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String description;

    //@Autowired
    @ManyToOne()//FetchType.LAZY)
    @JoinColumn(name = "genre_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Genre genre;

    //@Autowired
    @ManyToOne()//FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Country country;

    //@Autowired
    @ManyToOne()//FetchType.LAZY)
    @JoinColumn(name = "producer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Producer producer;

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }
    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    @Override
    public String toString() {
        return "Dvd {" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {

    }
}