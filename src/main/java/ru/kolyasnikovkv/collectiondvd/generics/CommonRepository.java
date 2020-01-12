package ru.kolyasnikovkv.collectiondvd.generics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.kolyasnikovkv.collectiondvd.repository.Genre;

import java.util.List;

@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
    List<E> findByName(String name);
}