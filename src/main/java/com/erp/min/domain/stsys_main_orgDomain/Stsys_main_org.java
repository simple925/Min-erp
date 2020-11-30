package com.erp.min.domain.stsys_main_orgDomain;

import com.erp.min.web.dto.stsys_main_orgDto.Stsys_main_org_UpdateRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Stsys_main_org {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id")
    private Long id;

    @Column(length = 10, nullable = false)
    private String org_key;

    @Column(length = 50, nullable = false)
    private String org_nm;

    @Column(length = 12)
    private String org_no;

    @Column(length = 50)
    private String org_en;

    @Column(length = 1)
    private String org_gb;
    @Column(length = 15)
    private String org_tel;
    @Column(length = 15)
    private String org_fax;
    @Column(length = 5)
    private String org_adr_no;
    @Column(length = 40)
    private String org_adr;
    @Column(length = 40)
    private String org_adr_d;
    @Column(length = 20)
    private String ceo_nm;
    @Column(length = 20)
    private String ceo_em;
    @Column(length = 12)
    private String ceo_jumin;
    @Column(columnDefinition = "DATE")
    private String open_dt;
    @Column(columnDefinition = "DATE")
    private String reg_dt;
    @Column(length = 10)
    private String org_upj;
    @Column(length = 10)
    private String org_upt;

    @Builder
    public Stsys_main_org(Long id, String org_key, String org_nm, String org_no, String org_en, String org_gb, String org_tel, String org_fax, String org_adr_no, String org_adr, String org_adr_d, String ceo_nm, String ceo_em, String ceo_jumin, String open_dt, String reg_dt, String org_upj, String org_upt) {
        this.id = id;
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

    public void update(Stsys_main_org_UpdateRequestDto requestDto){
        this.id = requestDto.getId();
        this.org_key = requestDto.getOrg_key();
        this.org_nm = requestDto.getOrg_nm();
        this.org_no = requestDto.getOrg_no();
        this.org_en = requestDto.getOrg_en();
        this.org_gb = requestDto.getOrg_gb();
        this.org_tel = requestDto.getOrg_tel();
        this.org_fax = requestDto.getOrg_fax();
        this.org_adr_no = requestDto.getOrg_adr_no();
        this.org_adr = requestDto.getOrg_adr();
        this.org_adr_d = requestDto.getOrg_adr_d();
        this.ceo_nm = requestDto.getCeo_nm();
        this.ceo_em = requestDto.getCeo_em();
        this.ceo_jumin = requestDto.getCeo_jumin();
        this.open_dt = requestDto.getOpen_dt();
        this.reg_dt = requestDto.getReg_dt();
        this.org_upj = requestDto.getOrg_adr();
        this.org_upt = requestDto.getOrg_adr();
    }
}
