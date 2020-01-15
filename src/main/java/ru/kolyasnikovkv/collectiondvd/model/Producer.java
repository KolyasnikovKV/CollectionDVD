package ru.kolyasnikovkv.collectiondvd.model;

import ru.kolyasnikovkv.collectiondvd.model.AbstractEntity;

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