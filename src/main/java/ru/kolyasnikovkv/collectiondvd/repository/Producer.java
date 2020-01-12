package ru.kolyasnikovkv.collectiondvd.repository;

import ru.kolyasnikovkv.collectiondvd.generics.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "producers")
public class Producer  extends AbstractEntity {

    public Producer(String name) {
        super();
        this.name = name;
    }

    public Producer() {
    }

    @Override
    public String toString() {
        return "Producer [name=" + name + "]";
    }
}