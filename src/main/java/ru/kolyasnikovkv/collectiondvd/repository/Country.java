package ru.kolyasnikovkv.collectiondvd.repository;

import ru.kolyasnikovkv.collectiondvd.generics.AbstractEntity;

import javax.persistence.*;

@Entity
//@Component
@Table(name = "countries")
/*@NamedQueries({
 ОШИБКА This inspection controls whether the Persistence QL Queries are error-checked
        @NamedQuery(name="Country.findByName", query="SELECT c.id from Country c where c.name = :name"),
        @NamedQuery(name="Country.findAll", query="SELECT c from Country c")
})*/
public class Country extends AbstractEntity {

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
}