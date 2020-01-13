package ru.kolyasnikovkv.collectiondvd.repository;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.kolyasnikovkv.collectiondvd.DataProvider;
import ru.kolyasnikovkv.collectiondvd.service.MyService;

public class CountryTest{

    @Autowired
    //Почемуто бин не инжектиться
    private static CountryRepository countryRepository;
    private static MyService myService ;


    @BeforeClass
    public static void initEntityManager() throws Exception {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataProvider.class);
        MyService myService = (MyService) context.getBean(MyService.class);
    }

    @AfterClass
    public static void closeEntityManager(){
    }

    @Test
    public void shouldCreateH2G2Book() throws Exception {
        Country country = new Country("USA_TEST");
        // ОШИБКА Вот здесь Null pointer exception
        //countryRepository.save(country);
        //myService.countryRepository.save(country);
    }

}
