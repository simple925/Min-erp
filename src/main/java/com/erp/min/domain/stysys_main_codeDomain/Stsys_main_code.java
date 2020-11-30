package com.erp.min.domain.stysys_main_codeDomain;

import com.erp.min.web.dto.stsys_main_codeDto.Stsys_main_code_UpdateRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@Entity
public class Stsys_main_code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public Stsys_main_code(Long code_id, String code_cd, String code_nm, String code_yn, String md_id, String org_id) {
        this.code_id = code_id;
        this.code_cd = code_cd;
        this.code_nm = code_nm;
        this.code_yn = code_yn;
        this.md_id = md_id;
        this.org_id = org_id;
    }

    public void update(Stsys_main_code_UpdateRequestDto entity){
        this.code_cd = entity.getCode_cd();
        this.code_nm = entity.getCode_nm();
        this.code_yn = entity.getCode_yn();
        this.md_id   = entity.getMd_id();
        this.org_id  = entity.getOrg_id();
    }
}
