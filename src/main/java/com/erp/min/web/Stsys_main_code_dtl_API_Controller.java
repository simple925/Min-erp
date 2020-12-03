package com.erp.min.web;

import com.erp.min.service.stsys_main_code_dtlService.Stsys_main_code_dtl_Service;
import com.erp.min.web.dto.stsys_main_code_dtlDto.Stsys_main_code_dtl_RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class Stsys_main_code_dtl_API_Controller {
    private final Stsys_main_code_dtl_Service stsys_main_code_dtl_service;

    @PostMapping("/api/dtl/save")
    public void save(@RequestBody List<Stsys_main_code_dtl_RequestDto> values) {
        for(Stsys_main_code_dtl_RequestDto dto : values){
            if (dto.getCode_dtl_check() == ""){
                // insert
                stsys_main_code_dtl_service.save(dto);
            } else {
                // update
                stsys_main_code_dtl_service.update(Long.parseLong(dto.getCode_dtl_check()), dto);
            }
        }
    }

    @DeleteMapping("/api/dtl/delete")
    public void deleteAll(@RequestParam(value = "ids[]") List<Long> ids){
        stsys_main_code_dtl_service.deleteAll(ids);
    }
}
