package com.erp.min.web;

import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code;
import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code_Repository;
import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl;
import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class Min_erp_Controller {
    private final Stsys_main_code_Repository stsys_main_code_repository;
    private final Stsys_main_code_dtl_Repository stsys_main_code_dtl_repository;
    @GetMapping("/min-erp")
    public String minErp(Model model){
        List<Stsys_main_code> codes = stsys_main_code_repository.findAllAsc();
        List<Stsys_main_code_dtl> codeDtls = stsys_main_code_dtl_repository.findAllAsc();
        if(codes != null) model.addAttribute("stsys_main_code", codes);
        if (codeDtls != null) model.addAttribute("stsys_main_code_dtl", codeDtls);
        return "min-erp";
    }

}
