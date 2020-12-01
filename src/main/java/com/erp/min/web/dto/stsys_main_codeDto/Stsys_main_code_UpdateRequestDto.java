package com.erp.min.web.dto.stsys_main_codeDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class Stsys_main_code_UpdateRequestDto {
    private String code_cd;
    private String code_nm;
    private String code_yn;
    private String md_id;
    private String org_id;

    @Builder
    public Stsys_main_code_UpdateRequestDto(String code_cd, String code_nm, String code_yn, String md_id, String org_id) {
        this.code_cd = code_cd;
        this.code_nm = code_nm;
        this.code_yn = code_yn;
        this.md_id = md_id;
        this.org_id = org_id;
    }


}
