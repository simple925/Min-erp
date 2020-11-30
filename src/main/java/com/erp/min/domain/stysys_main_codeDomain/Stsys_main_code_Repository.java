package com.erp.min.domain.stysys_main_codeDomain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Stsys_main_code_Repository extends JpaRepository<Stsys_main_code, Long> {
    @Query(value = "SELECT * FROM STSYS_MAIN_CODE ORDER BY code_id ASC", nativeQuery = true)
    List<Stsys_main_code> findAllAsc();

    @Query(value = "DELETE FROM STSYS_MAIN_CODE WHERE CODE_ID IN :id_list", nativeQuery = true)
    void deleteAll(@Param("id_list") List<Long> id_list);
}
