package com.erp.min.service.stsys_main_code_dtlService;

import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl;
import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl_Repository;
import com.erp.min.web.dto.stsys_main_code_dtlDto.Stsys_main_code_dtl_ListResponseDto;
import com.erp.min.web.dto.stsys_main_code_dtlDto.Stsys_main_code_dtl_RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class Stsys_main_code_dtl_Service {
    private final Stsys_main_code_dtl_Repository stsys_main_code_dtl_repository;

    @Transactional(readOnly = true)
    public List<Stsys_main_code_dtl_ListResponseDto> findAllAsc() {
        return stsys_main_code_dtl_repository.findAllAsc().stream()
                .map(Stsys_main_code_dtl_ListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void save(Stsys_main_code_dtl_RequestDto requestDto){
        stsys_main_code_dtl_repository.save(requestDto.toEntity());
    }

    @Transactional
    public void update(Long id, Stsys_main_code_dtl_RequestDto requestDto){
        Stsys_main_code_dtl stsys_main_code_dtl = stsys_main_code_dtl_repository.findById(id).orElseThrow(()->new IllegalArgumentException("업데이트할 값이 없습니다."));
    }

    @Transactional
    public void deleteAll(List<Long> ids){stsys_main_code_dtl_repository.deleteAll(ids);}
}

