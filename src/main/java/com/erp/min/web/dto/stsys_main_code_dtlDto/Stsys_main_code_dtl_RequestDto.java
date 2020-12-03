package com.erp.min.web.dto.stsys_main_code_dtlDto;

import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class Stsys_main_code_dtl_RequestDto {
    private String code_dtl_check;
    private String code_id;
    private String code_dtl_cd;
    private String code_dtl_nm;
    private String code_dtl_yn;
    private String code_dtl_flag01;
    private String code_dtl_flag02;
    private String code_dtl_flag03;

    @Builder
    public Stsys_main_code_dtl_RequestDto(String code_id, String code_dtl_cd, String code_dtl_nm, String code_dtl_yn, String code_dtl_flag01, String code_dtl_flag02, String code_dtl_flag03) {
        this.code_id = code_id;
        this.code_dtl_cd = code_dtl_cd;
        this.code_dtl_nm = code_dtl_nm;
        this.code_dtl_yn = code_dtl_yn;
        this.code_dtl_flag01 = code_dtl_flag01;
        this.code_dtl_flag02 = code_dtl_flag02;
        this.code_dtl_flag03 = code_dtl_flag03;
    }

    public Stsys_main_code_dtl toEntity() {
        return Stsys_main_code_dtl.builder()
                .code_id(code_id)
                .code_dtl_cd(code_dtl_cd)
                .code_dtl_nm(code_dtl_nm)
                .code_dtl_yn(code_dtl_yn)
                .code_dtl_flag01(code_dtl_flag01)
                .code_dtl_flag02(code_dtl_flag02)
                .code_dtl_flag03(code_dtl_flag03)
                .build();
    }

}
