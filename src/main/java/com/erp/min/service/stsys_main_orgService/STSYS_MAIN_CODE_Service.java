package com.erp.min.service.stsys_main_orgService;

import com.erp.min.domain.stysys_main_codeDomain.STSYS_MAIN_CODE_Repository;
import com.erp.min.web.dto.stsys_main_codeDto.STSYS_MAIN_CODE_RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class STSYS_MAIN_CODE_Service {
    private final STSYS_MAIN_CODE_Repository stsys_main_code_repository;

    @Transactional
    public Long save(STSYS_MAIN_CODE_RequestDto requestDto){
        return stsys_main_code_repository.save(requestDto.toEntity()).getCode_id();
    }
}
