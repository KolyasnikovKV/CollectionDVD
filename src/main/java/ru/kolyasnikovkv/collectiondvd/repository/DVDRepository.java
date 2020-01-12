package ru.kolyasnikovkv.collectiondvd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kolyasnikovkv.collectiondvd.dto.DVDDTO;
import ru.kolyasnikovkv.collectiondvd.generics.CommonRepository;

import java.util.List;


public interface DVDRepository extends CommonRepository<DVD> {

    //@Query("select ru.kolyasnikovkv.collectiondvd.dto.DVDDTO (m.id, m.name) from DVD m")
    @Query(name="findDataInDto")
    //DVDDTO getDataInDto(@Param("id") long id);
    DVDDTO getDataInDto();
}