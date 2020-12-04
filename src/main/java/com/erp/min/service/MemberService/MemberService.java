package com.erp.min.service.MemberService;

import com.erp.min.domain.Member.STSYS_MAIN_EMP;
import com.erp.min.domain.Member.STSYS_MAIN_EMP_Repository;
import com.erp.min.web.dto.Member.STSYS_MAIN_EMP_Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Null;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final STSYS_MAIN_EMP_Repository stsys_main_emp_repository;

    @Transactional
    public Long login(STSYS_MAIN_EMP_Dto stsys_main_emp_dto){
        STSYS_MAIN_EMP stsys_main_emp = stsys_main_emp_dto.toEntity();
        return stsys_main_emp.getId();
    }

    @Transactional
    public Long createUser(STSYS_MAIN_EMP_Dto stsys_main_emp_dto) {
        STSYS_MAIN_EMP stsys_main_emp = stsys_main_emp_dto.toEntity();
        stsys_main_emp_repository.save(stsys_main_emp);
        return stsys_main_emp.getId();
    }
}
