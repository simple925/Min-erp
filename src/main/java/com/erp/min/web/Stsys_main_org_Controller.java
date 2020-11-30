package com.erp.min.web;

import com.erp.min.service.stsys_main_orgService.Stsys_main_org_Service;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_RequestDto;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_ResponseDto;
import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class Stsys_main_org_Controller {
    private final Stsys_main_org_Service stsys_main_org_service;

    @PostMapping("/api/v1/main_save")
    public Long save(@RequestBody Stsys_main_org_RequestDto requestDto) {
        return stsys_main_org_service.save(requestDto);
    }

    @PutMapping("/api/v1/main_update/{id}")
    public Long update(@PathVariable Long id, @RequestBody Stsys_main_org_UpdateRequestDto requestDto){
        return stsys_main_org_service.update(id, requestDto);
    }

    @GetMapping("/api/v1/main_findById/P{id}")
    public Stsys_main_org_ResponseDto findById(@PathVariable Long id){
        return stsys_main_org_service.findById(id);
    }

}
