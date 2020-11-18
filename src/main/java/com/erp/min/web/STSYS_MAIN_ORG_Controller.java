package com.erp.min.web;

import com.erp.min.service.STSYS_MAIN_ORG_Service;
import com.erp.min.web.dto.STSYS_MAIN_ORG_Dto;
import com.erp.min.web.dto.STSYS_MAIN_ORG_ResponseDto;
import com.erp.min.web.dto.STSYS_MAIN_ORG_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class STSYS_MAIN_ORG_Controller {
    private final STSYS_MAIN_ORG_Service stsys_main_org_service;

    @PostMapping("/api/v1/main_save")
    public Long save(@RequestBody STSYS_MAIN_ORG_Dto requestDto) {
        return stsys_main_org_service.save(requestDto);
    }

    @PutMapping("/api/v1/main_update/{id}")
    public Long update(@PathVariable Long id, @RequestBody STSYS_MAIN_ORG_UpdateRequestDto requestDto){
        return stsys_main_org_service.update(id, requestDto);
    }

    @GetMapping("/api/v1/main_findById/P{id}")
    public STSYS_MAIN_ORG_ResponseDto findById(@PathVariable Long id){
        return stsys_main_org_service.findById(id);
    }
}
