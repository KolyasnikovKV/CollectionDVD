package ru.kolyasnikovkv.collectiondvd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kolyasnikovkv.collectiondvd.dto.CollectionDVDDTO;
import ru.kolyasnikovkv.collectiondvd.repository.*;

import java.util.List;


public interface CollectionDVDRepository extends JpaRepository<CollectionDVD, Long> {

    List<CollectionDVD> findByName(String name);

    //@Query("select ru.kolyasnikovkv.collectiondvd.dto.CollectionDVDDTO (m.id, m.name) from CollectionDVD m")
    @Query(name="findDataInDto")
    //CollectionDVDDTO getDataInDto(@Param("id") long id);
    CollectionDVDDTO  getDataInDto();
}