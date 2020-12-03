package com.erp.min.domain.stysys_main_code_dtlDomain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Stsys_main_code_dtl_Repository extends JpaRepository<Stsys_main_code_dtl, Long> {
    @Query(value = "SELECT * FROM STSYS_MAIN_CODE_DTL ORDER BY code_dtl_id ASC", nativeQuery = true)
    List<Stsys_main_code_dtl> findAllAsc();

    @Query(value = "DELETE FROM STSYS_MAIN_CODE_DTL WHERE code_dtl_id IN :ids", nativeQuery = true)
    void deleteAll(@Param("ids") List<Long> ids);
}
