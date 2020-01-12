package ru.kolyasnikovkv.collectiondvd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.kolyasnikovkv.collectiondvd.repository.CountryRepository;
import ru.kolyasnikovkv.collectiondvd.repository.DVDRepository;
import ru.kolyasnikovkv.collectiondvd.repository.GenreRepository;
import ru.kolyasnikovkv.collectiondvd.repository.ProducerRepository;

@Component
public class MyService{

    // ОШИБКА Здесь я попытался создать свзяь с бином и передать обобщенный тип, но что с ошибкой валиться
    @Autowired
    public CountryRepository countryRepository;

    @Autowired
    public GenreRepository genreRepository;

    @Autowired
    public DVDRepository dvdRepository;

    @Autowired
    public ProducerRepository producerRepository;

}
