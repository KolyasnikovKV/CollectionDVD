package ru.kolyasnikovkv.collectiondvd.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.kolyasnikovkv.collectiondvd.dto.CountryDto;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudCountryJpaDao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static ru.kolyasnikovkv.collectiondvd.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class CountryService {

    private final CrudCountryJpaDao repository;
    private final Converter<Country, CountryDto> converter;
    private final Converter<CountryDto, Country> converterDto;

   /* public List<AccountDTO> listByUser(Long userId) {
        return accountRepository.findAccountsByOwnerId(userId)
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
*/
    public CountryDto get(Long id) {
        Country country = repository.findById(id);
       // checkNotFoundWithId(country, id);
        return converter.convert(country);
    }

    public void delete(Long id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public CountryDto create(CountryDto countryDto){
        Country country = converterDto.convert(countryDto);
        country = repository.save(country);
        return converter.convert(country);
    }

    public CountryDto update(CountryDto countryDto) {
        Country country = repository.findById(countryDto.getId());
        //country = checkNotFoundWithId(country, countryDto.getId());
        country.setName(countryDto.getName());
        country = repository.save(country);
        return converter.convert(country);
    }
}