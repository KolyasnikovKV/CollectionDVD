package ru.kolyasnikovkv.collectiondvd.model;

import lombok.Getter;
import lombok.Setter;
import ru.kolyasnikovkv.collectiondvd.model.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "producers")
@Getter
@Setter
public class Producer  extends AbstractEntity<Long> {


    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;

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

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long aLong) {

    }
}