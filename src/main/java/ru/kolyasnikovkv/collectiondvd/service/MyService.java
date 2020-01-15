package ru.kolyasnikovkv.collectiondvd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kolyasnikovkv.collectiondvd.repository.CountryRepository;
import ru.kolyasnikovkv.collectiondvd.repository.DvdRepository;
import ru.kolyasnikovkv.collectiondvd.repository.GenreRepository;
import ru.kolyasnikovkv.collectiondvd.repository.ProducerRepository;

@Component
public class MyService{

    // ОШИБКА Здесь я попытался создать свзяь с бином и передать обобщенный тип, но что с ошибкой валиться
    @Autowired
    public CountryRepository countryRepositoryJpa;

    @Autowired
    public GenreRepository genreRepository;

    @Autowired
    public DvdRepository dvdRepository;

    @Autowired
    public ProducerRepository producerRepository;

}
