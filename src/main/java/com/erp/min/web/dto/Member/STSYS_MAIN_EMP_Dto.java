package com.erp.min.web.dto.Member;

import com.erp.min.domain.Member.STSYS_MAIN_EMP;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class STSYS_MAIN_EMP_Dto {
    private Long id;
    private String emp_gb;
    private String emp_id;
    private String emp_nm;
    private String emp_en;
    private String emp_incom;
    private String dept_cd;
    private String emp_pw;

    @Builder
    public STSYS_MAIN_EMP_Dto(Long id, String emp_gb, String emp_id, String emp_nm, String emp_en, String emp_incom, String dept_cd, String emp_pw) {
        this.id = id;
        this.emp_gb = emp_gb;
        this.emp_id = emp_id;
        this.emp_nm = emp_nm;
        this.emp_en = emp_en;
        this.emp_incom = emp_incom;
        this.dept_cd = dept_cd;
        this.emp_pw = emp_pw;

    }

    public STSYS_MAIN_EMP toEntity(){
        return STSYS_MAIN_EMP.builder()
                .id(id)
                .emp_gb(emp_gb)
                .emp_id(emp_id)
                .emp_nm(emp_nm)
                .emp_en(emp_en)
                .emp_incom(emp_incom)
                .dept_cd(dept_cd)
                .emp_pw(emp_pw)
                .build();
    }
}
