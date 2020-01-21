package ru.kolyasnikovkv.collectiondvd.repository.jdbc;

import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class JdbcCountryRepository  {

    public Country save(Country country) {
        return country;
    }

    public void delete(Long id) {
    }

    public Country get(Long id) {
        return new Country();
    }

    public List<Country> findAll() {
        return new ArrayList<Country>();
    }

    public List<Country> findByName(String name) {
        return new ArrayList<Country>();
    }
}
