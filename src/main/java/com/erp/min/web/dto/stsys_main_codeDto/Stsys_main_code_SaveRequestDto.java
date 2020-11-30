package com.erp.min.web.dto.stsys_main_codeDto;

import com.erp.min.domain.stysys_main_codeDomain.Stsys_main_code;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Stsys_main_code_SaveRequestDto {
    private String code_cd;
    private String code_nm;
    private String code_yn;
    private String md_id;
    private String org_id;

    @Builder
    public Stsys_main_code_SaveRequestDto(String code_cd, String code_nm, String code_yn, String md_id, String org_id) {
        this.code_cd = code_cd;
        this.code_nm = code_nm;
        this.code_yn = code_yn;
        this.md_id = md_id;
        this.org_id = org_id;
    }

    public Stsys_main_code toEntity() {
        return Stsys_main_code.builder()
                .code_cd(code_cd)
                .code_nm(code_nm)
                .code_yn(code_yn)
                .md_id(md_id)
                .org_id(org_id)
                .build();
    }
}
