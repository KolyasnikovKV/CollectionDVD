package ru.kolyasnikovkv.collectiondvd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "genres")
@Getter
@Setter
public class Genre extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;

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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {

    }
}