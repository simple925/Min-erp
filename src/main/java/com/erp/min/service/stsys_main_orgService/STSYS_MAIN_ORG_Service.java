package com.erp.min.service.stsys_main_orgService;

import com.erp.min.domain.stsys_main_orgDomain.STSYS_MAIN_ORG;
import com.erp.min.domain.stsys_main_orgDomain.STSYS_MAIN_ORG_Repository;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_Dto;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_RequestDto;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_ResponseDto;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class STSYS_MAIN_ORG_Service {
    private final STSYS_MAIN_ORG_Repository stsys_main_org_repository;

    @Transactional
    public Long save(STSYS_MAIN_ORG_RequestDto requestDto) {
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

    @Transactional
    public List<STSYS_MAIN_ORG> getSTSYS(){
        List<STSYS_MAIN_ORG> stsys_main_orgList = stsys_main_org_repository.findAll();
        return stsys_main_orgList;
    }
}
