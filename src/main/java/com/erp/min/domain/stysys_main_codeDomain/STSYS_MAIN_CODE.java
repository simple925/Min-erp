package com.erp.min.domain.stysys_main_codeDomain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Entity
public class STSYS_MAIN_CODE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "CODE_ID", unique = true, columnDefinition = "VARCHAR(10)")
    private Long code_id;

    @Column(length = 20)
    private String code_cd;
    @Column(length = 30)
    private String code_nm;
    @Column(length = 1)
    private String code_yn;
    @Column(length = 10)
    private String md_id;
    @Column(length = 10)
    private String org_id;

    @Builder
    public STSYS_MAIN_CODE(Long code_id, String code_cd, String code_nm, String code_yn, String md_id, String org_id) {
        this.code_id = code_id;
        this.code_cd = code_cd;
        this.code_nm = code_nm;
        this.code_yn = code_yn;
        this.md_id = md_id;
        this.org_id = org_id;
    }
}
