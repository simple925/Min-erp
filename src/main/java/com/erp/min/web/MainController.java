package com.erp.min.web;

import com.erp.min.service.stsys_main_orgService.STSYS_MAIN_ORG_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private STSYS_MAIN_ORG_Service stsys_main_org_service;
    @GetMapping("/getAll")
    public String getAll() {
        System.out.println("0번째 값을 확인함 : "+stsys_main_org_service.getSTSYS().get(0).getORG_NM());
        return "여긴되지?";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hihi";
    }
}
