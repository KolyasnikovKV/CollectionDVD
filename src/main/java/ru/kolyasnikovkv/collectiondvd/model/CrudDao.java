package ru.kolyasnikovkv.collectiondvd.model;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T, ID> {

    T save(T object);

    T update(T object);

    T findById(ID id);

    Boolean deleteById(ID id);

}