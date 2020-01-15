package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolyasnikovkv.collectiondvd.model.Genre;

import java.util.List;

public interface CrudGenreRepository extends JpaRepository<Genre, Long> {
  List<Genre> findByName(String name);
}