package ru.kolyasnikovkv.collectiondvd.model;

import org.springframework.util.Assert;

public interface WithId<ID> {
    ID getId();

    void setId(ID id);

    default boolean isNew() {
        return getId() == null;
    }

    // doesn't work for hibernate lazy proxy
    default ID id() {
        Assert.notNull(getId(), "Entity must has id");
        return getId();
    }
}
