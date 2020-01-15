package ru.kolyasnikovkv.collectiondvd.model;

import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

public interface AbstractInterfaceModel<E> {

    void delete(Long id);

    E save(E object);

    E get(Long id);

    List<E> findAll();

    List<E> findByName(String name);

}