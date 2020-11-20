package com.erp.min.domain.stysys_main_code_dtlDomain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class STSYS_MAIN_CODE_DTL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_DTL_ID", length = 10)
    private Long id;
    @Column(length = 10)
    private String CODE_ID;
    @Column(length = 20)
    private String CODE_DTL_CD;
    @Column(length = 30)
    private String CODE_DTL_NM;
    @Column(length = 1)
    private String CODE_DTL_YN;
    @Column(length = 30)
    private String CODE_DTL_FLAG01;
    @Column(length = 30)
    private String CODE_DTL_FLAG02;
    @Column(length = 30)
    private String CODE_DTL_FLAG03;
    @Column(length = 30)
    private String CODE_DTL_FLAG04;
    @Column(length = 30)
    private String CODE_DTL_FLAG05;

    @Builder
    public STSYS_MAIN_CODE_DTL(Long id, String CODE_ID, String CODE_DTL_CD, String CODE_DTL_NM, String CODE_DTL_YN, String CODE_DTL_FLAG01, String CODE_DTL_FLAG02, String CODE_DTL_FLAG03, String CODE_DTL_FLAG04, String CODE_DTL_FLAG05) {
        this.id = id;
        this.CODE_ID = CODE_ID;
        this.CODE_DTL_CD = CODE_DTL_CD;
        this.CODE_DTL_NM = CODE_DTL_NM;
        this.CODE_DTL_YN = CODE_DTL_YN;
        this.CODE_DTL_FLAG01 = CODE_DTL_FLAG01;
        this.CODE_DTL_FLAG02 = CODE_DTL_FLAG02;
        this.CODE_DTL_FLAG03 = CODE_DTL_FLAG03;
        this.CODE_DTL_FLAG04 = CODE_DTL_FLAG04;
        this.CODE_DTL_FLAG05 = CODE_DTL_FLAG05;
    }
}
