package ru.kolyasnikovkv.collectiondvd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolyasnikovkv.collectiondvd.generics.CommonRepository;

import java.util.List;

public interface CountryRepository extends CommonRepository<Country> {
  }
