package ru.kolyasnikovkv.collectiondvd.repository;

import javax.persistence.*;

@Entity
//@Component
@Table(name = "countries")
/*@NamedQueries({
 ОШИБКА This inspection controls whether the Persistence QL Queries are error-checked
        @NamedQuery(name="Country.findByName", query="SELECT c.id from Country c where c.name = :name"),
        @NamedQuery(name="Country.findAll", query="SELECT c from Country c")
})*/
public class Country {
    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    //    @Column(name = "id", unique = true, nullable = false, columnDefinition = "integer default nextval('global_seq')")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private long id;
    public String name;

    public Country(String name) {
        super();
        this.name = name;
    }
    public Country() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [name=" + name + "]";
    }
}