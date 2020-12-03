package com.erp.min.web.dto.stsys_main_code_dtlDto;

import com.erp.min.domain.stysys_main_code_dtlDomain.Stsys_main_code_dtl;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class Stsys_main_code_dtl_ListResponseDto {
    private Long code_dtl_id;
    private String code_id;
    private String code_dtl_cd;
    private String code_dtl_nm;
    private String code_dtl_yn;
    private String code_dtl_flag01;
    private String code_dtl_flag02;
    private String code_dtl_flag03;
    private String code_dtl_flag04;
    private String code_dtl_flag05;

    public Stsys_main_code_dtl_ListResponseDto(Stsys_main_code_dtl entity) {
        this.code_dtl_id     = entity.getCode_dtl_id();
        this.code_id         = entity.getCode_dtl_cd();
        this.code_dtl_cd     = entity.getCode_dtl_cd();
        this.code_dtl_nm     = entity.getCode_dtl_nm();
        this.code_dtl_yn     = entity.getCode_dtl_yn();
        this.code_dtl_flag01 = entity.getCode_dtl_flag01();
        this.code_dtl_flag02 = entity.getCode_dtl_flag02();
        this.code_dtl_flag03 = entity.getCode_dtl_flag03();
        this.code_dtl_flag04 = entity.getCode_dtl_flag04();
        this.code_dtl_flag05 = entity.getCode_dtl_flag05();
    }
}
