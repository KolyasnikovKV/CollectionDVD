package ru.kolyasnikovkv.collectiondvd.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudCountryJpaDao;

import java.time.LocalDate;
import java.util.List;

@Service
public class CountryService {

    private final CrudCountryJpaDao repository;

    public CountryService(CrudCountryJpaDao repository) {
        this.repository = repository;
    }

    public Country get(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void update(CountryDto countryDto) {
        long id = countryDto.getId();
        // Как правильно прочекать что id не null
        Country country= repository.findById(id);
        repository.save(updateFromDto(country, countryDto));
    }

    public Country create(CountryDto countryDto) {
        //Assert.notNull(, "must not be null");
        return repository.save(createNewEntityFromDto(countryDto));
    }

    public static CountryDto createNewDtoFromEntity(Country country) {

        return new CountryDto(country.getId(), country.getName());
    }

    public static Country createNewEntityFromDto(CountryDto countryDto) {
        return new Country(countryDto.getId(), countryDto.getName());
    }

    public static Country updateFromDto(Country country, CountryDto countryDto) {
        country.setId(countryDto.getId());
        country.setName(countryDto.getName());
        return country;
    }
}