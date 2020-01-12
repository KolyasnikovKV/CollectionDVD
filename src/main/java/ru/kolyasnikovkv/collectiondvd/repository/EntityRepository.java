package ru.kolyasnikovkv.collectiondvd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntityRepository extends JpaRepository<Country, Long> {
    List<Country> findByName(String name);
}
