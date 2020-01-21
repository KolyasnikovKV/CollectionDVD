package ru.kolyasnikovkv.collectiondvd.model;

import org.springframework.util.Assert;

public interface WithId<ID> {
    ID getId();

    void setId(ID id);
}
