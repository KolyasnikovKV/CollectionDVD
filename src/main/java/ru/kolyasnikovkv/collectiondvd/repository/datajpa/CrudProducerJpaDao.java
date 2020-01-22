package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.CrudDao;
import ru.kolyasnikovkv.collectiondvd.model.Producer;

import java.util.List;

@Repository
public class CrudProducerJpaDao implements CrudDao<Producer, Long> {

    @Autowired
    private CrudRepositoryProducerJpaDao jpaReposotiry;

    @Override
    public Producer save(Producer producer) {
        return jpaReposotiry.save(producer);
    }

    @Override
    public Producer update(Producer producer) {
        return jpaReposotiry.save(producer);
    }

    @Override
    public Producer findById(Long id) {
        return jpaReposotiry.findById(id).get();
    }

    @Override
    public Boolean deleteById(Long id) {
        jpaReposotiry.deleteById(id);
        return true;
    }
}