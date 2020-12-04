package com.erp.min.domain.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "stsys_main_emp")
public class STSYS_MAIN_EMP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_no")
    private Long id;

    @Column(length = 3, nullable = false)
    private String emp_gb;

    @Column(length = 10, nullable = false)
    private String emp_id;

    @Column(length = 20, nullable = false)
    private String emp_nm;

    @Column(length = 20)
    private String emp_en;

    @Column(length = 3, nullable = false)
    private String emp_incom;

    @Column(length = 10)
    private String dept_cd;

    @Column(length = 10, nullable = false)
    private String emp_pw;

    @Builder
    public STSYS_MAIN_EMP(Long id, String emp_gb, String emp_id, String emp_nm, String emp_en, String emp_incom, String dept_cd, String emp_pw) {
        this.id = id;
        this.emp_gb = emp_gb;
        this.emp_id = emp_id;
        this.emp_nm = emp_nm;
        this.emp_en = emp_en;
        this.emp_incom = emp_incom;
        this.dept_cd = dept_cd;
        this.emp_pw = emp_pw;

    }
//    public void update(STSYS_MAIN_EMP_SaveRequestDto requestDto){
//        this.id = requestDto.getId();
//        this.emp_gb = requestDto.getEmp_gb();
//        this.emp_no = requestDto.getEmp_no();
//        this.emp_nm = requestDto.getEmp_nm();
//        this.emp_en = requestDto.getEmp_en();
//        this.emp_incom = requestDto.getEmp_incom();
//        this.dept_cd = requestDto.getDept_cd();
//        this.emp_pw = requestDto.getEmp_pw();
//
//    }
}
