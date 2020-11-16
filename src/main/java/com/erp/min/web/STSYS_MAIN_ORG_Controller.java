package com.erp.min.web;

import com.erp.min.service.STSYS_MAIN_ORG_Service;
import com.erp.min.web.dto.STSYS_MAIN_ORG_Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class STSYS_MAIN_ORG_Controller {
    private final STSYS_MAIN_ORG_Service stsys_main_org_service;

    @PostMapping("/api/s1/main_save")
    public Long save(@RequestBody STSYS_MAIN_ORG_Dto requestDto) {
        return stsys_main_org_service.save(requestDto);
    }

//    @PutMapping("/api/u1/main")
}
