package com.erp.min.service;

import com.erp.min.domain.STSYS_MAIN_ORG_Repository;
import com.erp.min.web.dto.STSYS_MAIN_ORG_Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class STSYS_MAIN_ORG_Service {
    private final STSYS_MAIN_ORG_Repository stsys_main_org_repository;

    @Transactional
    public Long save(STSYS_MAIN_ORG_Dto requestDto) {
        return stsys_main_org_repository.save(requestDto.toEntity()).getORG_ID();
    }
}
