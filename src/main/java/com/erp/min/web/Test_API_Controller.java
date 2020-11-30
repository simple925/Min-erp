package com.erp.min.web;

import com.erp.min.service.stsys_main_orgService.STSYS_MAIN_CODE_Service;
import com.erp.min.web.dto.stsys_main_codeDto.STSYS_MAIN_CODE_RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestController
public class Test_API_Controller {
    private final STSYS_MAIN_CODE_Service stsys_main_code_service;

    @PostMapping("/api/code/save")
    public Long save(@RequestBody STSYS_MAIN_CODE_RequestDto requestDto){
        return stsys_main_code_service.save(requestDto);
    }
}
