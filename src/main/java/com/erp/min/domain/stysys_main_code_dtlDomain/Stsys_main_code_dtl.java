package com.erp.min.domain.stysys_main_code_dtlDomain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Stsys_main_code_dtl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_dtl_id", length = 10)
    private Long id;
    @Column(length = 10)
    private String code_id;
    @Column(length = 20)
    private String code_dtl_cd;
    @Column(length = 30)
    private String code_dtl_nm;
    @Column(length = 1)
    private String code_dtl_yn;
    @Column(length = 30)
    private String code_dtl_flag01;
    @Column(length = 30)
    private String code_dtl_flag02;
    @Column(length = 30)
    private String code_dtl_flag03;
    @Column(length = 30)
    private String code_dtl_flag04;
    @Column(length = 30)
    private String code_dtl_flag05;

    @Builder
    public Stsys_main_code_dtl(Long id, String code_id, String code_dtl_cd, String code_dtl_nm, String code_dtl_yn, String code_dtl_flag01, String code_dtl_flag02, String code_dtl_flag03, String code_dtl_flag04, String code_dtl_flag05) {
        this.id = id;
        this.code_id = code_id;
        this.code_dtl_cd = code_dtl_cd;
        this.code_dtl_nm = code_dtl_nm;
        this.code_dtl_yn = code_dtl_yn;
        this.code_dtl_flag01 = code_dtl_flag01;
        this.code_dtl_flag02 = code_dtl_flag02;
        this.code_dtl_flag03 = code_dtl_flag03;
        this.code_dtl_flag04 = code_dtl_flag04;
        this.code_dtl_flag05 = code_dtl_flag05;
    }
}
