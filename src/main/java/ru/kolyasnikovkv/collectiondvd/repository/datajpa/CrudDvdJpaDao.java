package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;

@Repository
public class CrudDvdJpaDao implements CrudDao<Dvd, Long> {

    private final CrudRepositoryDvdJpaDao jpaReposotiry;

    public CrudDvdJpaDao(CrudRepositoryDvdJpaDao jpaReposotiry) {
        this.jpaReposotiry = jpaReposotiry;
    }
    @Override
    public Dvd save(Dvd dvd) {
        return jpaReposotiry.save(dvd);
    }

    @Override
    public Dvd findById(Long id) {
        return jpaReposotiry.findById(id).get();
    }

    @Override
    public boolean delete(Long id) {
        jpaReposotiry.deleteById(id);
        return true;
    }
}
