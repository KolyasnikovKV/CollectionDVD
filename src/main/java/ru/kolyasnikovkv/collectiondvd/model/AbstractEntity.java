package ru.kolyasnikovkv.collectiondvd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Serializable, WithId<ID> {
    public static final int START_SEQ = 100000;
    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    //    @Column(name = "id", unique = true, nullable = false, columnDefinition = "integer default nextval('global_seq')")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    protected ID id;

}

