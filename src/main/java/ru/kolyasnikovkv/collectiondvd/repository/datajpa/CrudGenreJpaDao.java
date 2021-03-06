package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;
import ru.kolyasnikovkv.collectiondvd.model.Genre;

import java.util.List;

@Repository
public class CrudGenreJpaDao implements CrudDao<Genre, Long> {

  @Autowired
  private CrudRepositoryGenreJpaDao jpaReposotiry;

  @Override
  public Genre save(Genre genre) {
    return jpaReposotiry.save(genre);
  }


  @Override
  public Genre findById(Long id) {
    return jpaReposotiry.findById(id).get();
  }

  @Override
  public boolean delete(Long id) {
    jpaReposotiry.deleteById(id);
    return true;
  }
}