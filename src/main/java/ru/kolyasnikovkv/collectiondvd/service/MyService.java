package ru.kolyasnikovkv.collectiondvd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kolyasnikovkv.collectiondvd.model.*;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudCountryJpaDao;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudDvdJpaDao;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudGenreJpaDao;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudProducerJpaDao;


@Component
public class MyService{

    // ОШИБКА Здесь я попытался создать свзяь с бином и передать обобщенный тип, но что с ошибкой валиться
    @Autowired
    public CrudCountryJpaDao countryRepositoryJpa;

    @Autowired
    public CrudGenreJpaDao genreRepository;

    @Autowired
    public CrudDvdJpaDao dvdRepository;

    @Autowired
    public CrudProducerJpaDao producerRepository;

}
