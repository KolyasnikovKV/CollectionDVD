package ru.kolyasnikovkv.collectiondvd.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;

@Service
public class DtoToCountryConverter implements Converter<CountryDto, Country> {
    @Override
    public Country convert(CountryDto source) {
        Country country = new Country();
        country.setId(source.getId());
        country.setName(source.getName());
        return country;
    }
}
