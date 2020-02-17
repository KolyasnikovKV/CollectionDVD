package ru.kolyasnikovkv.collectiondvd.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.kolyasnikovkv.collectiondvd.model.Country;

import java.util.List;

public interface CrudRepositoryCountryJpaDao extends JpaRepository<Country, Long> {
    List<Country> findByName(String name);

    @Modifying
    @Transactional
    @Query("DELETE FROM Country m WHERE m.id=:id")
    int delete(@Param("id") Long id);
}