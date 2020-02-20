package ru.kolyasnikovkv.collectiondvd.dto;
import lombok.*;

import java.io.Serializable;

@Getter // сгенерировать get'еры для всех полей
@Setter // сгенерировать set'еры для всех полей
@NoArgsConstructor // сгенерировать конструктор без параметров
@AllArgsConstructor // сгенерировать конструктор со всеми параметрами
@EqualsAndHashCode
//@RequiredArgsConstructor
public class ProducerDto implements Serializable {
    private Long id;
    private String name;
}
