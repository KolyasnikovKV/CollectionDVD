package ru.kolyasnikovkv.collectiondvd.repository;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudRepositoryCountryJpaDao;
import ru.kolyasnikovkv.collectiondvd.service.CountryService;
import ru.kolyasnikovkv.collectiondvd.service.MyService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
@EnableJpaRepositories(basePackages={"ru.kolyasnikovkv.collectiondvd.repository.datajpa"})
@ContextConfiguration(classes = {DataProvider.class})
public class CountryTest{

    @Autowired
    //Почемуто бин не инжектиться
    private static CrudRepositoryCountryJpaDao myService ;

    //@PersistenceContext
    //private EntityManager em;

    final static Logger logger = Logger.getLogger(CountryTest.class);


    @BeforeClass
    public static void initEntityManager() throws Exception {
        //Пришлось делать так, попробую потом на service/controller
        // так тест работает, а при прямом инжекте - нет
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DataProvider.class);
        myService = (CrudRepositoryCountryJpaDao) context.getBean(CrudRepositoryCountryJpaDao.class);
        logger.debug("debug"); // all
        logger.info("info"); // except debug
        logger.warn("warn"); // except debug and info
        logger.error("error"); // except debug, info and warn
        logger.fatal("fatal"); // only fatal
    }

    @AfterClass
    public static void closeEntityManager(){
    }

    @Test
    public void createdCountryTest() throws Exception {
        Country countryDto = new Country(null, "USA_TEST2");
        // ОШИБКА Вот здесь NullPointerException countryRepositor
        //countryRepositoryJpa.save(country);
        myService.save(countryDto);
    }

}
