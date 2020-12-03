package com.erp.min.service.stsys_main_codeService;

import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code;
import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code_Repository;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_ListResponseDto;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_ResponseDto;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_SaveRequestDto;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class Stsys_main_code_Service {
    private final Stsys_main_code_Repository stsys_main_code_repository;

    @Transactional
    public Long save(Stsys_main_code_SaveRequestDto requestDto){
        return stsys_main_code_repository.save(requestDto.toEntity()).getCode_id();
    }

    @Transactional
    public Long update(Long id, Stsys_main_code_UpdateRequestDto requestDto){
        Stsys_main_code stsys_main_code = stsys_main_code_repository.findById(id).orElseThrow(()->new IllegalArgumentException("변경할 코드값이 없습니다. = "+id));
        stsys_main_code.update(requestDto);
        return id;
    }

    @Transactional(readOnly = true)
    public Stsys_main_code_ResponseDto findById(Long id) {
        Stsys_main_code entity = stsys_main_code_repository.findById(id).orElseThrow(()->new IllegalArgumentException("찾는 코드가 존재하지 않습니다. = "+id));
        return new Stsys_main_code_ResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<Stsys_main_code_ListResponseDto> findAllAsc() {
        return stsys_main_code_repository.findAllAsc().stream()
                .map(Stsys_main_code_ListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteAll(List<Long> id_list){
        stsys_main_code_repository.deleteAll(id_list);
    }

}
