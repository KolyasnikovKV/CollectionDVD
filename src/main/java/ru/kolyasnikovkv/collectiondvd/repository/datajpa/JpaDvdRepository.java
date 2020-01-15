package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kolyasnikovkv.collectiondvd.model.Country;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;
import ru.kolyasnikovkv.collectiondvd.repository.DvdRepository;

import java.util.List;

@Repository
public class JpaDvdRepository implements DvdRepository {

    @Autowired
    private CrudDvdRepository crudDvdRepository;

    public Dvd save(Dvd dvd) {
        return crudDvdRepository.save(dvd);
    }

    public void delete(Long id) {
        crudDvdRepository.deleteById(id);
    }

    public Dvd get(Long id) {
        return crudDvdRepository.getOne(id);
    }

    public List<Dvd> findAll() {
        return crudDvdRepository.findAll();
    }

    public List<Dvd> findByName(String name) {
        return crudDvdRepository.findByName(name);
    }
}



