package ru.kolyasnikovkv.collectiondvd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "genres")
@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class Genre extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 120)
    private String name;

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