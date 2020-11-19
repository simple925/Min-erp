package com.erp.min.web.dto.stsys_main_orgDto;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class STSYS_MAIN_ORG_UpdateRequestDto {
    private Long id;
    private String ORG_KEY;
    private String ORG_NM;
    private String ORG_NO;
    private String ORG_EN;
    private String ORG_GB;
    private String ORG_TEL;
    private String ORG_FAX;
    private String ORG_ADR_NO;
    private String ORG_ADR;
    private String ORG_ADR_D;
    private String CEO_NM;
    private String CEO_EM;
    private String CEO_JUMIN;
    private String OPEN_DT;
    private String REG_DT;
    private String ORG_UPJ;
    private String ORG_UPT;

    @Builder

    public STSYS_MAIN_ORG_UpdateRequestDto(Long id, String ORG_KEY, String ORG_NM, String ORG_NO, String ORG_EN, String ORG_GB, String ORG_TEL, String ORG_FAX, String ORG_ADR_NO, String ORG_ADR, String ORG_ADR_D, String CEO_NM, String CEO_EM, String CEO_JUMIN, String OPEN_DT, String REG_DT, String ORG_UPJ, String ORG_UPT) {
        this.id = id;
        this.ORG_KEY = ORG_KEY;
        this.ORG_NM = ORG_NM;
        this.ORG_NO = ORG_NO;
        this.ORG_EN = ORG_EN;
        this.ORG_GB = ORG_GB;
        this.ORG_TEL = ORG_TEL;
        this.ORG_FAX = ORG_FAX;
        this.ORG_ADR_NO = ORG_ADR_NO;
        this.ORG_ADR = ORG_ADR;
        this.ORG_ADR_D = ORG_ADR_D;
        this.CEO_NM = CEO_NM;
        this.CEO_EM = CEO_EM;
        this.CEO_JUMIN = CEO_JUMIN;
        this.OPEN_DT = OPEN_DT;
        this.REG_DT = REG_DT;
        this.ORG_UPJ = ORG_UPJ;
        this.ORG_UPT = ORG_UPT;
    }
}
