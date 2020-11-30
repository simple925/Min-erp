package com.erp.min.service.stsys_main_orgService;

import com.erp.min.domain.stsys_main_orgDomain.Stsys_main_org;
import com.erp.min.domain.stsys_main_orgDomain.Stsys_main_org_Repository;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_RequestDto;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_ResponseDto;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Stsys_main_org_Service {
    private final Stsys_main_org_Repository stsys_main_org_repository;

    @Transactional
    public Long save(Stsys_main_org_RequestDto requestDto) {
        return stsys_main_org_repository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, Stsys_main_org_UpdateRequestDto requestDto){
        Stsys_main_org stsys_main_org = stsys_main_org_repository.findById(id).orElseThrow(()->new IllegalArgumentException("업데이트할 정보가 없습니다. id="+id));
        stsys_main_org.update(requestDto);
        return id;
    }

    @Transactional
    public Stsys_main_org_ResponseDto findById(Long id) {
        Stsys_main_org entity = stsys_main_org_repository.findById(id).orElseThrow(()-> new IllegalArgumentException("찾는 정보가 없습니다. id="+id));
        return new Stsys_main_org_ResponseDto(entity);
    }

    @Transactional
    public List<Stsys_main_org> getSTSYS(){
        List<Stsys_main_org> stsys_main_orgList = stsys_main_org_repository.findAll();
        return stsys_main_orgList;
    }
}
