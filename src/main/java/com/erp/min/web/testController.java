package com.erp.min.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RequiredArgsConstructor
@Controller
public class testController {
    @GetMapping("/min-erp")
    public String minErp(){
        return "min-erp";
    }
}
