package ru.kolyasnikovkv.collectiondvd.model;

import ru.kolyasnikovkv.collectiondvd.model.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "genres")
public class Genre extends AbstractEntity {

    public Genre(String name) {
        super();
        this.name = name;
    }

    public Genre() {
    }

    @Override
    public String toString() {
        return "Genre [name=" + name + "]";
    }
}