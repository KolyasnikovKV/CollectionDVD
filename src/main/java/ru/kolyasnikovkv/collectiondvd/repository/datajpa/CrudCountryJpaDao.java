package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;
import ru.kolyasnikovkv.collectiondvd.repository.datajpa.CrudRepositoryCountryJpaDao;

@Repository
public class CrudCountryJpaDao implements CrudDao<Country, Long> {

  private final CrudRepositoryCountryJpaDao jpaReposotiry;

  public CrudCountryJpaDao(CrudRepositoryCountryJpaDao jpaReposotiry) {
    this.jpaReposotiry = jpaReposotiry;
  }
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
