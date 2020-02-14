package ru.kolyasnikovkv.collectiondvd.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;

@Service
public class CountryToDtoConverter implements Converter<Country, CountryDto> {
    @Override
    public CountryDto convert(Country source) {
        CountryDto countryDTO = new CountryDto();
        countryDTO.setId(source.getId());
        countryDTO.setName(source.getName());
        return countryDTO;
    }
}
