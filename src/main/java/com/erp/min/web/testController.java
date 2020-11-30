package com.erp.min.web;

import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code;
import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class testController {
    private final Stsys_main_code_Repository stsys_main_code_repository;
    @GetMapping("/min-erp")
    public String minErp(Model model){
        List<Stsys_main_code> codeList = stsys_main_code_repository.findAllAsc();
        if(codeList != null) model.addAttribute("stsys_main_code", codeList);
        return "min-erp";
    }

}
