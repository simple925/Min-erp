package com.erp.min.web.STSYS_MAIN_ORG_controller;

import com.erp.min.domain.stsys_main_orgDomain.STSYS_MAIN_ORG;
import com.erp.min.domain.stsys_main_orgDomain.STSYS_MAIN_ORG_Repository;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_RequestDto;
import com.erp.min.web.dto.stsys_main_orgDto.STSYS_MAIN_ORG_UpdateRequestDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class STSYS_MAIN_ORG_TESTAPI {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private STSYS_MAIN_ORG_Repository stsys_main_org_repository;

//    @After
//    public void tearDown() throws Exception {
//        stsys_main_org_repository.deleteAll();
//    }

    @Test
    public void sts_등록된다() throws Exception {
        List<String> testDataList = new ArrayList<>();
        for(int i=0;i<17;i++){
            testDataList.add("testData"+i);
        }
        STSYS_MAIN_ORG_RequestDto requestDto = STSYS_MAIN_ORG_RequestDto.builder()
                .org_key(testDataList.get(0))
                .org_nm(testDataList.get(1))
                .ceo_em(testDataList.get(2))
                .ceo_jumin(testDataList.get(3))
                .ceo_nm(testDataList.get(4))
                .open_dt(testDataList.get(5))
                .org_adr(testDataList.get(6))
                .org_adr_d(testDataList.get(7))
                .org_adr_no(testDataList.get(8))
                .org_en(testDataList.get(9))
                .org_fax(testDataList.get(10))
                .org_gb(testDataList.get(11))
                .org_no(testDataList.get(12))
                .org_tel(testDataList.get(13))
                .org_upj(testDataList.get(14))
                .org_upt(testDataList.get(15))
                .reg_dt(testDataList.get(16))
                .build();
        String url = "http://localhost:" + port + "/api/v1/main_save";
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);

        List<STSYS_MAIN_ORG> all = stsys_main_org_repository.findAll();
        assertThat(all.get(0).getOrg_key()   ).isEqualTo(testDataList.get(0));
        assertThat(all.get(0).getOrg_nm()    ).isEqualTo(testDataList.get(1));
        assertThat(all.get(0).getCeo_em()    ).isEqualTo(testDataList.get(2));
        assertThat(all.get(0).getCeo_jumin() ).isEqualTo(testDataList.get(3));
        assertThat(all.get(0).getCeo_nm()    ).isEqualTo(testDataList.get(4));
        assertThat(all.get(0).getOpen_dt()   ).isEqualTo(testDataList.get(5));
        assertThat(all.get(0).getOrg_adr()   ).isEqualTo(testDataList.get(6));
        assertThat(all.get(0).getOrg_adr_d() ).isEqualTo(testDataList.get(7));
        assertThat(all.get(0).getOrg_adr_no()).isEqualTo(testDataList.get(8));
        assertThat(all.get(0).getOrg_en()    ).isEqualTo(testDataList.get(9));
        assertThat(all.get(0).getOrg_fax()   ).isEqualTo(testDataList.get(10));
        assertThat(all.get(0).getOrg_gb()    ).isEqualTo(testDataList.get(11));
        assertThat(all.get(0).getOrg_no()    ).isEqualTo(testDataList.get(12));
        assertThat(all.get(0).getOrg_tel()   ).isEqualTo(testDataList.get(13));
        assertThat(all.get(0).getOrg_upj()   ).isEqualTo(testDataList.get(14));
        assertThat(all.get(0).getOrg_upt()   ).isEqualTo(testDataList.get(15));
        assertThat(all.get(0).getReg_dt()    ).isEqualTo(testDataList.get(16));
    }
    @Test
    public void sts_수정된다() throws Exception {
        STSYS_MAIN_ORG saved = stsys_main_org_repository.save(STSYS_MAIN_ORG.builder()
                .org_key("key")
                .org_nm("nm")
                .ceo_em("ceoen")
                .ceo_jumin("ceojumiN")
                .ceo_nm("ceonm")
                .open_dt("open")
                .org_adr("org_adr")
                .org_adr_d("d")
                .org_adr_no("no")
                .org_en("en")
                .org_fax("fax")
                .org_gb("gb")
                .org_no("no")
                .org_tel("tel")
                .org_upj("upj")
                .org_upt("upt")
                .reg_dt("dt")
                .build()
        );
        Long updateId = saved.getId();
        List<String> testDataList = new ArrayList<>();
        for(int i=0;i<17;i++){
            testDataList.add("testData"+i);
        }
        STSYS_MAIN_ORG_UpdateRequestDto requestDto = STSYS_MAIN_ORG_UpdateRequestDto.builder()
                .org_key(testDataList.get(0))
                .org_nm(testDataList.get(1))
                .ceo_em(testDataList.get(2))
                .ceo_jumin(testDataList.get(3))
                .ceo_nm(testDataList.get(4))
                .open_dt(testDataList.get(5))
                .org_adr(testDataList.get(6))
                .org_adr_d(testDataList.get(7))
                .org_adr_no(testDataList.get(8))
                .org_en(testDataList.get(9))
                .org_fax(testDataList.get(10))
                .org_gb(testDataList.get(11))
                .org_no(testDataList.get(12))
                .org_tel(testDataList.get(13))
                .org_upj(testDataList.get(14))
                .org_upt(testDataList.get(15))
                .reg_dt(testDataList.get(16))
                .build();
        String url = "http://localhost:"+port+"/api/v1/main_update/"+updateId;
    }
}
