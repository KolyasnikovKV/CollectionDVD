package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;

@Repository
public class CrudCountryJpaDao implements CrudDao<Country, Long> {

  private final CrudRepositoryCountryJpaDao jpaRepository;

  public CrudCountryJpaDao(CrudRepositoryCountryJpaDao jpaRepository) {
    this.jpaRepository = jpaRepository;
  }
  @Override
  public Country save(Country country) {
    return jpaRepository.save(country);
  }

  @Override
  public Country findById(Long id) {
    return jpaRepository.findById(id).get();
  }

  @Override
  public boolean delete(Long id) {
    return (jpaRepository.delete(id) != 0);
  }
}
