package ru.kolyasnikovkv.collectiondvd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import ru.kolyasnikovkv.collectiondvd.model.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
//@Component
@Table(name = "countries")
/*@NamedQueries({
 ОШИБКА This inspection controls whether the Persistence QL Queries are error-checked
        @NamedQuery(name="Country.findByName", query="SELECT c.id from Country c where c.name = :name"),
        @NamedQuery(name="Country.findAll", query="SELECT c from Country c")
})*/
@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
//@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class Country extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;

    //А что если надо будет вызвать super(id)
    public Country(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [name=" + name + "]";
    }

    // Переопределение не работаект с loombook
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(Hibernate.getClass(o))) {
            return false;
        }
        Country that = (Country) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id == null ? null : id.hashCode();
    }
}