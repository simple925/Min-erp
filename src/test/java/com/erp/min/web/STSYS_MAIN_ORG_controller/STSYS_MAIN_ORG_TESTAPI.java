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
                .ORG_KEY(testDataList.get(0))
                .ORG_NM(testDataList.get(1))
                .CEO_EM(testDataList.get(2))
                .CEO_JUMIN(testDataList.get(3))
                .CEO_NM(testDataList.get(4))
                .OPEN_DT(testDataList.get(5))
                .ORG_ADR(testDataList.get(6))
                .ORG_ADR_D(testDataList.get(7))
                .ORG_ADR_NO(testDataList.get(8))
                .ORG_EN(testDataList.get(9))
                .ORG_FAX(testDataList.get(10))
                .ORG_GB(testDataList.get(11))
                .ORG_NO(testDataList.get(12))
                .ORG_TEL(testDataList.get(13))
                .ORG_UPJ(testDataList.get(14))
                .ORG_UPT(testDataList.get(15))
                .REG_DT(testDataList.get(16))
                .build();
        String url = "http://localhost:" + port + "/api/v1/main_save";
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);

        List<STSYS_MAIN_ORG> all = stsys_main_org_repository.findAll();
        assertThat(all.get(0).getORG_KEY()   ).isEqualTo(testDataList.get(0));
        assertThat(all.get(0).getORG_NM()    ).isEqualTo(testDataList.get(1));
        assertThat(all.get(0).getCEO_EM()    ).isEqualTo(testDataList.get(2));
        assertThat(all.get(0).getCEO_JUMIN() ).isEqualTo(testDataList.get(3));
        assertThat(all.get(0).getCEO_NM()    ).isEqualTo(testDataList.get(4));
        assertThat(all.get(0).getOPEN_DT()   ).isEqualTo(testDataList.get(5));
        assertThat(all.get(0).getORG_ADR()   ).isEqualTo(testDataList.get(6));
        assertThat(all.get(0).getORG_ADR_D() ).isEqualTo(testDataList.get(7));
        assertThat(all.get(0).getORG_ADR_NO()).isEqualTo(testDataList.get(8));
        assertThat(all.get(0).getORG_EN()    ).isEqualTo(testDataList.get(9));
        assertThat(all.get(0).getORG_FAX()   ).isEqualTo(testDataList.get(10));
        assertThat(all.get(0).getORG_GB()    ).isEqualTo(testDataList.get(11));
        assertThat(all.get(0).getORG_NO()    ).isEqualTo(testDataList.get(12));
        assertThat(all.get(0).getORG_TEL()   ).isEqualTo(testDataList.get(13));
        assertThat(all.get(0).getORG_UPJ()   ).isEqualTo(testDataList.get(14));
        assertThat(all.get(0).getORG_UPT()   ).isEqualTo(testDataList.get(15));
        assertThat(all.get(0).getREG_DT()    ).isEqualTo(testDataList.get(16));
    }
    @Test
    public void sts_수정된다() throws Exception {
        STSYS_MAIN_ORG saved = stsys_main_org_repository.save(STSYS_MAIN_ORG.builder()
                .ORG_KEY("KEY")
                .ORG_NM("NM")
                .CEO_EM("CEOEN")
                .CEO_JUMIN("CEOJUMIN")
                .CEO_NM("CEONM")
                .OPEN_DT("OPEN")
                .ORG_ADR("ORG_ADR")
                .ORG_ADR_D("D")
                .ORG_ADR_NO("NO")
                .ORG_EN("EN")
                .ORG_FAX("FAX")
                .ORG_GB("GB")
                .ORG_NO("NO")
                .ORG_TEL("TEL")
                .ORG_UPJ("UPJ")
                .ORG_UPT("UPT")
                .REG_DT("DT")
                .build()
        );
        Long updateId = saved.getId();
        List<String> testDataList = new ArrayList<>();
        for(int i=0;i<17;i++){
            testDataList.add("testData"+i);
        }
        STSYS_MAIN_ORG_UpdateRequestDto requestDto = STSYS_MAIN_ORG_UpdateRequestDto.builder()
                .ORG_KEY(testDataList.get(0))
                .ORG_NM(testDataList.get(1))
                .CEO_EM(testDataList.get(2))
                .CEO_JUMIN(testDataList.get(3))
                .CEO_NM(testDataList.get(4))
                .OPEN_DT(testDataList.get(5))
                .ORG_ADR(testDataList.get(6))
                .ORG_ADR_D(testDataList.get(7))
                .ORG_ADR_NO(testDataList.get(8))
                .ORG_EN(testDataList.get(9))
                .ORG_FAX(testDataList.get(10))
                .ORG_GB(testDataList.get(11))
                .ORG_NO(testDataList.get(12))
                .ORG_TEL(testDataList.get(13))
                .ORG_UPJ(testDataList.get(14))
                .ORG_UPT(testDataList.get(15))
                .REG_DT(testDataList.get(16))
                .build();
        String url = "http://localhost:"+port+"/api/v1/main_update/"+updateId;
    }
}
