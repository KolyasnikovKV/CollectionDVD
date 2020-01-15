package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolyasnikovkv.collectiondvd.model.Producer;

import java.util.List;

public interface CrudProducerRepository extends JpaRepository<Producer, Long> {
    List<Producer> findByName(String name);
}