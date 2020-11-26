package com.erp.min.web.dto.stsys_main_codeDto;

import com.erp.min.domain.stysys_main_codeDomain.STSYS_MAIN_CODE;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class STSYS_MAIN_CODE_RequestDto {
    private String code_cd;
    private String code_nm;
    private String code_yn;
    private String md_id;
    private String org_id;

    @Builder
    public STSYS_MAIN_CODE_RequestDto(String code_cd, String code_nm, String code_yn, String md_id, String org_id) {
        this.code_cd = code_cd;
        this.code_nm = code_nm;
        this.code_yn = code_yn;
        this.md_id = md_id;
        this.org_id = org_id;
    }

    public STSYS_MAIN_CODE toEntity() {
        return STSYS_MAIN_CODE.builder()
                .code_cd(code_cd)
                .code_nm(code_nm)
                .code_yn(code_yn)
                .md_id(md_id)
                .org_id(org_id)
                .build();
    }
}
