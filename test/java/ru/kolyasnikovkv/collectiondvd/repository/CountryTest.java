package ru.kolyasnikovkv.collectiondvd.repository;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import ru.kolyasnikovkv.collectiondvd.DataProvider;
import ru.kolyasnikovkv.collectiondvd.service.MyService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
@EnableJpaRepositories(basePackages={"ru.kolyasnikovkv.collectiondvd.repository"})
@ContextConfiguration(classes = {DataProvider.class})
public class CountryTest{

    @Autowired
    //Почемуто бин не инжектиться
    private static CountryRepository countryRepository;
    //private static MyService myService ;
    @PersistenceContext
    private EntityManager em;


    @BeforeClass
    public static void initEntityManager() throws Exception {
        /*AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataProvider.class);
        MyService myService = (MyService) context.getBean(MyService.class);*/
    }

    @AfterClass
    public static void closeEntityManager(){
    }

    @Test
    public void createdContryTest() throws Exception {
        Country country = new Country("USA_TEST");
        // ОШИБКА Вот здесь NullPointerException countryRepository
        countryRepository.save(country);
        //myService.countryRepository.save(country);
    }

}
