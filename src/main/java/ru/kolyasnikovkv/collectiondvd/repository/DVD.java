package ru.kolyasnikovkv.collectiondvd.repository;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.kolyasnikovkv.collectiondvd.dto.DVDDTO;
import ru.kolyasnikovkv.collectiondvd.generics.AbstractEntity;

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


@Entity
@SqlResultSetMapping(
        name="mapDataInDto",
        classes = {
                @ConstructorResult(
                        targetClass= DVDDTO.class,
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
        @NamedQuery(name="DVD.findAll", query="SELECT c from DVD c")
})*/
@Table(name = "collection_dvd")
public class DVD extends AbstractEntity {

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

     public DVD(String name, String description, Genre genre, Country country, Producer producer) {
        this.dateTime = LocalDateTime.now();
        this.genre = genre;
        this.country = country;
        this.producer = producer;
        this.description = description;
        this.name = name;

    }

    public DVD() {
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "DVD {" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }
}