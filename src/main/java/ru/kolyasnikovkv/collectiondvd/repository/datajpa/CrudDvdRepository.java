package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kolyasnikovkv.collectiondvd.dto.DvdDto;
import ru.kolyasnikovkv.collectiondvd.model.Dvd;

import java.util.List;


public interface CrudDvdRepository extends JpaRepository<Dvd, Long> {

    List<Dvd> findByName(String name);
    //@Query("select ru.kolyasnikovkv.collectiondvd.dto.DvdDto (m.id, m.name) from Dvd m")
    @Query(name="findDataInDto")
    //DvdDto getDataInDto(@Param("id") long id);
    DvdDto getDataInDto();
}