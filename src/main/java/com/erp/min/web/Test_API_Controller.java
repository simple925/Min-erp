package com.erp.min.web;

import com.erp.min.service.stsys_main_orgService.Stsys_main_code_Service;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_ResponseDto;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_SaveRequestDto;
import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_UpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class Test_API_Controller {
    private final Stsys_main_code_Service stsys_main_code_service;

    @PostMapping("/api/code/save")
//    public Long save(@RequestBody Stsys_main_code_SaveRequestDto requestDto){
    public void save(@RequestBody List<Stsys_main_code_SaveRequestDto> values){
        for (Stsys_main_code_SaveRequestDto dto:values) {
            if (dto.getCheck_code() == ""){
                // insert
                stsys_main_code_service.save(dto);
            } else {
                // update
                stsys_main_code_service.update(Long.parseLong(dto.getCheck_code()),Stsys_main_code_SaveRequestDto.save_to_update_dto(dto));
            }
        }
//        return stsys_main_code_service.save(requestDto);
    }

    @PutMapping("/api/code/update/{id}")
    public Long update(@PathVariable Long id, @RequestBody Stsys_main_code_UpdateRequestDto reuqestDto) {
        return stsys_main_code_service.update(id, reuqestDto);
    }

    @GetMapping("/api/code/findById/{id}")
    public Stsys_main_code_ResponseDto findById (@PathVariable Long id) {
        return stsys_main_code_service.findById(id);
    }

    @DeleteMapping("/api/code/delete")
    public void deleteAll(@RequestParam(value = "id_list[]") List<Long> id_list){
        stsys_main_code_service.deleteAll(id_list);
    }
}
