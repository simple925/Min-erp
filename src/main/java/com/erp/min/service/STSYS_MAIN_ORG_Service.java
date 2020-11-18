package com.erp.min.service;

import com.erp.min.domain.STSYS_MAIN_ORG;
import com.erp.min.domain.STSYS_MAIN_ORG_Repository;
import com.erp.min.web.dto.STSYS_MAIN_ORG_Dto;
import com.erp.min.web.dto.STSYS_MAIN_ORG_ResponseDto;
import com.erp.min.web.dto.STSYS_MAIN_ORG_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class STSYS_MAIN_ORG_Service {
    private final STSYS_MAIN_ORG_Repository stsys_main_org_repository;

    @Transactional
    public Long save(STSYS_MAIN_ORG_Dto requestDto) {
        return stsys_main_org_repository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, STSYS_MAIN_ORG_UpdateRequestDto requestDto){
        STSYS_MAIN_ORG stsys_main_org = stsys_main_org_repository.findById(id).orElseThrow(()->new IllegalArgumentException("업데이트할 정보가 없습니다. id="+id));
        stsys_main_org.update(requestDto);
        return id;
    }

    @Transactional
    public STSYS_MAIN_ORG_ResponseDto findById(Long id) {
        STSYS_MAIN_ORG entity = stsys_main_org_repository.findById(id).orElseThrow(()-> new IllegalArgumentException("찾는 정보가 없습니다. id="+id));
        return new STSYS_MAIN_ORG_ResponseDto(entity);
    }
}
