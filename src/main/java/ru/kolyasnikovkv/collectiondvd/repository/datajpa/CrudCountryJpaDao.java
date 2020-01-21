package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;

@Repository
public class CrudCountryJpaDao implements CrudDao<Country, Long> {

  @Autowired
  private JpaRepository<Country, Long> jpaReposotiry;


  @Override
  public Country save(Country country) {
    return jpaReposotiry.save(country);
  }

  @Override
  public Country update(Country country) {
    return jpaReposotiry.save(country);
  }

  @Override
  public Country findById(Long id) {
    return jpaReposotiry.findById(id).get();
  }

  @Override
  public Boolean deleteById(Long id) {
    jpaReposotiry.deleteById(id);
    return true;
  }
}
