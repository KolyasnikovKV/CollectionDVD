package ru.kolyasnikovkv.collectiondvd.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
public class ProducerDto implements Serializable {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Producer {" +
                "id=" + id +
                ", name=" + name + '}';
    }
}
