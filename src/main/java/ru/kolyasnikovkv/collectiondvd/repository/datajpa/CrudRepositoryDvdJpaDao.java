package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;

import java.util.List;

public interface CrudRepositoryDvdJpaDao extends JpaRepository<Dvd, Long> {
    List<Dvd> findByName(String name);
}