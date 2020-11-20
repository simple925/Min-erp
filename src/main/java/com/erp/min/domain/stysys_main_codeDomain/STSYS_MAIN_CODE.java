package com.erp.min.domain.stysys_main_codeDomain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class STSYS_MAIN_CODE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_ID", length = 10)
    private Long id;
    @Column(length = 20)
    private String CODE_CD;
    @Column(length = 30)
    private String CODE_NM;
    @Column(length = 1)
    private String CODE_YN;
    @Column(length = 10)
    private String MD_ID  ;
    @Column(length = 10)
    private String ORG_ID ;

    @Builder
    public STSYS_MAIN_CODE(Long id, String CODE_CD, String CODE_NM, String CODE_YN, String MD_ID, String ORG_ID) {
        this.id = id;
        this.CODE_CD = CODE_CD;
        this.CODE_NM = CODE_NM;
        this.CODE_YN = CODE_YN;
        this.MD_ID = MD_ID;
        this.ORG_ID = ORG_ID;
    }
}
