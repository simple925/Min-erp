package com.erp.min.web.dto.stsys_main_orgDto;

import com.erp.min.domain.stsys_main_orgDomain.Stsys_main_org;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Stsys_main_org_RequestDto {
    private String org_key;
    private String org_nm;
    private String org_no;
    private String org_en;
    private String org_gb;
    private String org_tel;
    private String org_fax;
    private String org_adr_no;
    private String org_adr;
    private String org_adr_d;
    private String ceo_nm;
    private String ceo_em;
    private String ceo_jumin;
    private String open_dt;
    private String reg_dt;
    private String org_upj;
    private String org_upt;
    @Builder
    public Stsys_main_org_RequestDto(String org_key,
                                     String org_nm,
                                     String org_no,
                                     String org_en,
                                     String org_gb,
                                     String org_tel,
                                     String org_fax,
                                     String org_adr_no,
                                     String org_adr,
                                     String org_adr_d,
                                     String ceo_nm,
                                     String ceo_em,
                                     String ceo_jumin,
                                     String open_dt,
                                     String reg_dt,
                                     String org_upj,
                                     String org_upt) {
        this.org_key = org_key;
        this.org_nm = org_nm;
        this.org_no = org_no;
        this.org_en = org_en;
        this.org_gb = org_gb;
        this.org_tel = org_tel;
        this.org_fax = org_fax;
        this.org_adr_no = org_adr_no;
        this.org_adr = org_adr;
        this.org_adr_d = org_adr_d;
        this.ceo_nm = ceo_nm;
        this.ceo_em = ceo_em;
        this.ceo_jumin = ceo_jumin;
        this.open_dt = open_dt;
        this.reg_dt = reg_dt;
        this.org_upj = org_upj;
        this.org_upt = org_upt;
    }


    public Stsys_main_org toEntity(){
        return Stsys_main_org.builder()
                .org_key(org_key)
                .org_nm(org_nm)
                .org_no(org_no)
                .org_en(org_en)
                .org_gb(org_gb)
                .org_tel(org_tel)
                .org_fax(org_fax)
                .org_adr_no(org_adr_no)
                .org_adr(org_adr)
                .org_adr_d(org_adr_d)
                .ceo_nm(ceo_nm)
                .ceo_em(ceo_em)
                .ceo_jumin(ceo_jumin)
                .open_dt(open_dt)
                .reg_dt(reg_dt)
                .org_upj(org_upj)
                .org_upt(org_upt)
                .build();
    }
}
