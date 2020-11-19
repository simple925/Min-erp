package com.erp.min.domain.stsys_main_orgDomain;

import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_UpdateRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class STSYS_MAIN_ORG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORG_ID")
    private Long id;

    @Column(length = 10, nullable = false)
    private String ORG_KEY;

    @Column(length = 50, nullable = false)
    private String ORG_NM;

    @Column(length = 12)
    private String ORG_NO;

    @Column(length = 50)
    private String ORG_EN;

    @Column(length = 1)
    private String ORG_GB;
    @Column(length = 15)
    private String ORG_TEL;
    @Column(length = 15)
    private String ORG_FAX;
    @Column(length = 5)
    private String ORG_ADR_NO;
    @Column(length = 40)
    private String ORG_ADR;
    @Column(length = 40)
    private String ORG_ADR_D;
    @Column(length = 20)
    private String CEO_NM;
    @Column(length = 20)
    private String CEO_EM;
    @Column(length = 12)
    private String CEO_JUMIN;
    @Column(columnDefinition = "DATE")
    private String OPEN_DT;
    @Column(columnDefinition = "DATE")
    private String REG_DT;
    @Column(length = 10)
    private String ORG_UPJ;
    @Column(length = 10)
    private String ORG_UPT;

    @Builder
    public STSYS_MAIN_ORG(Long id, String ORG_KEY, String ORG_NM, String ORG_NO, String ORG_EN, String ORG_GB, String ORG_TEL, String ORG_FAX, String ORG_ADR_NO, String ORG_ADR, String ORG_ADR_D, String CEO_NM, String CEO_EM, String CEO_JUMIN, String OPEN_DT, String REG_DT, String ORG_UPJ, String ORG_UPT) {
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

    public void update(STSYS_MAIN_ORG_UpdateRequestDto requestDto){
        this.id = requestDto.getId();
        this.ORG_KEY = requestDto.getORG_KEY();
        this.ORG_NM = requestDto.getORG_NM();
        this.ORG_NO = requestDto.getORG_NO();
        this.ORG_EN = requestDto.getORG_EN();
        this.ORG_GB = requestDto.getORG_GB();
        this.ORG_TEL = requestDto.getORG_TEL();
        this.ORG_FAX = requestDto.getORG_FAX();
        this.ORG_ADR_NO = requestDto.getORG_ADR_NO();
        this.ORG_ADR = requestDto.getORG_ADR();
        this.ORG_ADR_D = requestDto.getORG_ADR_D();
        this.CEO_NM = requestDto.getCEO_NM();
        this.CEO_EM = requestDto.getCEO_EM();
        this.CEO_JUMIN = requestDto.getCEO_JUMIN();
        this.OPEN_DT = requestDto.getOPEN_DT();
        this.REG_DT = requestDto.getREG_DT();
        this.ORG_UPJ = requestDto.getORG_ADR();
        this.ORG_UPT = requestDto.getORG_ADR();
    }
}
