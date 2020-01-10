package ru.kolyasnikovkv.collectiondvd.dto;
import java.io.Serializable;

public class CollectionDVDDTO  implements Serializable {
    private Long id;
    private String name;

    public CollectionDVDDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CollectionDVDDTO() {
    }

    @Override
    public String toString() {
        return "DVD {" +
                "id=" + id +
                ", name=" + name + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
