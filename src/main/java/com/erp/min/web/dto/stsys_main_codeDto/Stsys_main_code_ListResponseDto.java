package com.erp.min.web.dto.stsys_main_codeDto;

import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code;
import lombok.Getter;

@Getter
public class Stsys_main_code_ListResponseDto {
    private Long code_id;
    private String code_cd;
    private String code_nm;
    private String code_yn;
    private String md_id;
    private String org_id;

    public Stsys_main_code_ListResponseDto(Stsys_main_code entity) {
        this.code_id = entity.getCode_id();
        this.code_cd = entity.getCode_cd();
        this.code_nm = entity.getCode_nm();
        this.code_yn = entity.getCode_yn();
        this.md_id   = entity.getMd_id();
        this.org_id  = entity.getOrg_id();
    }
}
