package com.erp.min.web.dto;

import com.erp.min.domain.STSYS_MAIN_ORG;
import lombok.Getter;

@Getter
public class STSYS_MAIN_ORG_ResponseDto {
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

    public STSYS_MAIN_ORG_ResponseDto(STSYS_MAIN_ORG entity) {
        this.id = entity.getId();
        this.ORG_KEY = entity.getORG_KEY();
        this.ORG_NM = entity.getCEO_NM();
        this.ORG_NO = entity.getORG_NO();
        this.ORG_EN = entity.getORG_EN();
        this.ORG_GB = entity.getORG_GB();
        this.ORG_TEL = entity.getORG_TEL();
        this.ORG_FAX = entity.getORG_FAX();
        this.ORG_ADR_NO = entity.getORG_ADR_NO();
        this.ORG_ADR = entity.getORG_ADR();
        this.ORG_ADR_D = entity.getORG_ADR_D();
        this.CEO_NM = entity.getCEO_NM();
        this.CEO_EM = entity.getCEO_EM();
        this.CEO_JUMIN = entity.getCEO_JUMIN();
        this.OPEN_DT = entity.getOPEN_DT();
        this.REG_DT = entity.getREG_DT();
    }
}
