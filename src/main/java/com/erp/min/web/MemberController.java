package com.erp.min.web;

import com.erp.min.service.MemberService.MemberService;
import com.erp.min.web.dto.Member.STSYS_MAIN_EMP_Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String createUserForm(Model model) {
        model.addAttribute("userForm", new STSYS_MAIN_EMP_Dto());

        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest req, RedirectAttributes rttr, @Valid STSYS_MAIN_EMP_Dto stsys_main_emp_dto){

        HttpSession session =  req.getSession();
        memberService.login(stsys_main_emp_dto);

        if(stsys_main_emp_dto == null){
            session.setAttribute("stsys_main_emp_dto", null);
            rttr.addFlashAttribute("msg",false);
        } else {
            session.setAttribute("stsys_main_emp_dto", stsys_main_emp_dto);
        }
        return "redirect:/";
    }

    @PostMapping("/join")
    public String createUser(@Valid STSYS_MAIN_EMP_Dto stsys_main_emp_dto, BindingResult result){
        if(result.hasErrors()){
            return "/hello";
        }
        System.out.println("다녀옴");
        memberService.createUser(stsys_main_emp_dto);

        return "redirect:/hello";
    }
}