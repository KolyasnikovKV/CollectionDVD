package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.repository.CountryRepository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class JpaCountryRepository implements CountryRepository {

    @Autowired
    private CrudCountryRepository crudCountryRepository;

    public Country save(Country country) {
        return crudCountryRepository.save(country);
    }

    public void delete(Long id) {
        crudCountryRepository.deleteById(id);
    }

    public Country get(Long id) {
        return crudCountryRepository.getOne(id);
    }

    public List<Country> findAll() {
        return crudCountryRepository.findAll();
    }

    public List<Country> findByName(String name) {
        return crudCountryRepository.findByName(name);
    }
}



