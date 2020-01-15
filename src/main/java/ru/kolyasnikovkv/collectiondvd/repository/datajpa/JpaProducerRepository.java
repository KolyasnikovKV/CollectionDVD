package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Genre;
import ru.kolyasnikovkv.collectiondvd.model.Producer;
import ru.kolyasnikovkv.collectiondvd.repository.ProducerRepository;

import java.util.List;

@Repository
public class JpaProducerRepository implements ProducerRepository {

    @Autowired
    private CrudProducerRepository crudProducerRepository;

    public Producer save(Producer producer) {
        return crudProducerRepository.save(producer);
    }

    public void delete(Long id) {
        crudProducerRepository.deleteById(id);
    }

    public Producer get(Long id) {
        return crudProducerRepository.getOne(id);
    }

    public List<Producer> findAll() {
        return crudProducerRepository.findAll();
    }

    public List<Producer> findByName(String name) {
        return crudProducerRepository.findByName(name);
    }
}



