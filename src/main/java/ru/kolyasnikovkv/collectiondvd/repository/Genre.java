package ru.kolyasnikovkv.collectiondvd.repository;

import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    //    @Column(name = "id", unique = true, nullable = false, columnDefinition = "integer default nextval('global_seq')")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private long id;
    public String name;

    public Genre(String name) {
        super();
        this.name = name;
    }
    public Genre() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre [name=" + name + "]";
    }
}