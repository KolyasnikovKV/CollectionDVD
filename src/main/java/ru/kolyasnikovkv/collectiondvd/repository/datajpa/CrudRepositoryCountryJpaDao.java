package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolyasnikovkv.collectiondvd.model.Country;

import java.util.List;

public interface CrudRepositoryCountryJpaDao extends JpaRepository<Country, Long> {
    List<Country> findByName(String name);
}