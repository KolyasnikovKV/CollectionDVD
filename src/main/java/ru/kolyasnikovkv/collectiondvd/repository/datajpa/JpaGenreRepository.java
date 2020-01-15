package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Genre;
import ru.kolyasnikovkv.collectiondvd.repository.GenreRepository;

import java.util.List;

@Repository
public class JpaGenreRepository implements GenreRepository {

    @Autowired
    private CrudGenreRepository crudGenreRepository;

    public Genre save(Genre genre) {
        return crudGenreRepository.save(genre);
    }

    public void delete(Long id) {
        crudGenreRepository.deleteById(id);
    }

    public Genre get(Long id) {
        return crudGenreRepository.getOne(id);
    }

    public List<Genre> findAll() {
        return crudGenreRepository.findAll();
    }

    public List<Genre> findByName(String name) {
        return crudGenreRepository.findByName(name);
    }
}



