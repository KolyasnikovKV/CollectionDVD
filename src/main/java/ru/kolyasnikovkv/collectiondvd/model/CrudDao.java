package ru.kolyasnikovkv.collectiondvd.model;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T, ID> {

    T findById(ID id);

    T save(T object);

    boolean delete(ID id);

}