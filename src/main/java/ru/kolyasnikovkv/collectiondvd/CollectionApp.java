package ru.kolyasnikovkv.collectiondvd;

import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;
import ru.kolyasnikovkv.collectiondvd.model.Genre;
import ru.kolyasnikovkv.collectiondvd.model.Producer;
import ru.kolyasnikovkv.collectiondvd.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CollectionApp {

      public static void  main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataProvider.class);

        MyService myService = (MyService) context.getBean(MyService.class);

        Genre genre = new Genre("Triller");
        myService.genreRepository.save(genre);

        Country country = new Country("USA");
        myService.countryRepositoryJpa.save(country);

        Producer producer = new Producer("Spielberg");
        myService.producerRepository.save(producer);

        Dvd collectionDvd = new Dvd("Moon", "Moon", genre, country, producer);
        myService.dvdRepository.save(collectionDvd);

        /*Iterable<Dvd> findDVDs = myService.dvdRepository.findAll();
        System.out.println("Dvd found with findAll():");
        System.out.println("************************LIST Dvd************************ ");
        for (Dvd dvd : findDVDs) {
            System.out.println(dvd);
            System.out.println(dvd.getProducer());
            System.out.println("------------------------");
        }*/

        /*Вот эта строка если раскоментировать выдает ОШИБКУ
        DvdDto findDVDdto = collectionDVDRepository.getDataInDto();*/

        /*org.hibernate.HibernateException: Got different size of tuples and aliases
	at org.hibernate.jpa.spi.NativeQueryTupleTransformer$NativeTupleImpl.<init>(NativeQueryTupleTransformer.java:68)
	at org.hibernate.jpa.spi.NativeQueryTupleTransformer.transformTuple(NativeQueryTupleTransformer.java:28)
	at org.hibernate.hql.internal.HolderInstantiator.instantiate(HolderInstantiator.java:85)
	at org.hibernate.loader.custom.CustomLoader.getResultList(CustomLoader.java:433)
	at org.hibernate.loader.Loader.listIgnoreQueryCache(Loader.java:2629)
	at org.hibernate.loader.Loader.list(Loader.java:2624)
	at org.hibernate.loader.custom.CustomLoader.list(CustomLoader.java:338)
	at org.hibernate.internal.SessionImpl.listCustomQuery(SessionImpl.java:2123)
	at org.hibernate.internal.AbstractSharedSessionContract.list(AbstractSharedSessionContract.java:1134)
	at org.hibernate.query.internal.NativeQueryImpl.doList(NativeQueryImpl.java:173)
	at org.hibernate.query.internal.AbstractProducedQuery.list(AbstractProducedQuery.java:1526)
	at org.hibernate.query.internal.AbstractProducedQuery.getSingleResult(AbstractProducedQuery.java:1574)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498) */

        /*for (DvdDto dvd : findDVDdto) {
            System.out.println(dvd);
            System.out.println("------------------------");
        }*/
        System.out.println("------------------------");


        context.close();
    }
}
