package ru.kolyasnikovkv.collectiondvd.model;

import lombok.Getter;
import lombok.Setter;
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
@Getter @Setter
public class Country extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;
    public Country(String name) {
        super();
        this.name = name;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country [name=" + name + "]";
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {

    }
}