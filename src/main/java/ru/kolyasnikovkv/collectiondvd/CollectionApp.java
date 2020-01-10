package ru.kolyasnikovkv.collectiondvd;

import ru.kolyasnikovkv.collectiondvd.dto.CollectionDVDDTO;
import ru.kolyasnikovkv.collectiondvd.repository.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CollectionApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataProvider.class);
        GenreRepository genreRepository = context.getBean(GenreRepository.class);
        CountryRepository countryRepository = context.getBean(CountryRepository.class);
        ProducerRepository producerRepository = context.getBean(ProducerRepository.class);
        CollectionDVDRepository collectionDVDRepository = context.getBean(CollectionDVDRepository.class);

        Genre genre = new Genre("Triller");
        genreRepository.save(genre);

        Country country = new Country("USA");
        countryRepository.save(country);

        Producer producer = new Producer("Spielberg");
        producerRepository.save(producer);

        CollectionDVD collectionDVD = new CollectionDVD("Moon", "Moon", genre, country, producer);
        collectionDVDRepository.save(collectionDVD);

        Iterable<CollectionDVD> findDVDs = collectionDVDRepository.findAll();
        System.out.println("DVD found with findAll():");
        System.out.println("************************LIST DVD************************ ");
        for (CollectionDVD dvd : findDVDs) {
            System.out.println(dvd);
            System.out.println(dvd.getProducer());
            System.out.println("------------------------");
        }

        //CollectionDVDDTO findDVDdto = collectionDVDRepository.getDataInDto(100003);
        //CollectionDVDDTO findDVDdto = collectionDVDRepository.getDataInDto();
        /*for (CollectionDVDDTO dvd : findDVDdto) {
            System.out.println(dvd);
            System.out.println("------------------------");
        }*/
        System.out.println("------------------------");


        context.close();
    }
}
