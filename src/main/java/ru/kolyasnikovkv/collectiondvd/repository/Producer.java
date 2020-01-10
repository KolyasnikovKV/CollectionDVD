package ru.kolyasnikovkv.collectiondvd.repository;

import javax.persistence.*;

@Entity
@Table(name = "producers")
public class Producer {
    public static final int START_SEQ = 100000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    //    @Column(name = "id", unique = true, nullable = false, columnDefinition = "integer default nextval('global_seq')")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private long id;
    public String name;

    public Producer(String name) {
        super();
        this.name = name;
    }
    public Producer() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Producer [name=" + name + "]";
    }
}