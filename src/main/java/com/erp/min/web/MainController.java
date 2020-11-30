package com.erp.min.web;

import com.erp.min.service.stsys_main_orgService.Stsys_main_org_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Stsys_main_org_Service stsys_main_org_service;
    @GetMapping("/hello")
    public String hello() {
        return "hihi";
    }
    @GetMapping("/getAll")
    public String getAll(){
        return stsys_main_org_service.getSTSYS().get(0).getOrg_nm();
    }

}
