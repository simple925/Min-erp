package com.erp.min.web.dto.stsys_main_orgDto;

import com.erp.min.domain.stsys_main_orgDomain.STSYS_MAIN_ORG;
import lombok.Getter;

@Getter
public class STSYS_MAIN_ORG_ResponseDto {
    private Long id;
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

    public STSYS_MAIN_ORG_ResponseDto(STSYS_MAIN_ORG entity) {
        this.id = entity.getId();
        this.org_key = entity.getOrg_key();
        this.org_nm = entity.getCeo_nm();
        this.org_no = entity.getOrg_no();
        this.org_en = entity.getOrg_en();
        this.org_gb = entity.getOrg_gb();
        this.org_tel = entity.getOrg_tel();
        this.org_fax = entity.getOrg_fax();
        this.org_adr_no = entity.getOrg_adr_no();
        this.org_adr = entity.getOrg_adr();
        this.org_adr_d = entity.getOrg_adr_d();
        this.ceo_nm = entity.getCeo_nm();
        this.ceo_em = entity.getCeo_em();
        this.ceo_jumin = entity.getCeo_jumin();
        this.open_dt = entity.getOpen_dt();
        this.reg_dt = entity.getReg_dt();
    }
}
