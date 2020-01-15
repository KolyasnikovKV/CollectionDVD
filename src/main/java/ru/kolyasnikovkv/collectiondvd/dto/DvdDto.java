package ru.kolyasnikovkv.collectiondvd.dto;
import java.io.Serializable;

public class DvdDto implements Serializable {
    private Long id;
    private String name;

    public DvdDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DvdDto() {
    }

    @Override
    public String toString() {
        return "Dvd {" +
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
