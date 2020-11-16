package com.erp.min.RepositoryTest;

import com.erp.min.domain.STSYS_MAIN_ORG;
import com.erp.min.domain.STSYS_MAIN_ORG_Repository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class STSYS_MAIN_ORG_Test {

    @Autowired
    STSYS_MAIN_ORG_Repository stsys_main_org_repository;

    @After
    public void cleanup() {
        stsys_main_org_repository.deleteAll();
    }

    @Test
    public void 메인테이플_확인(){
        stsys_main_org_repository.save(STSYS_MAIN_ORG.builder()
                .ORG_NM("정윤도")
                .ORG_KEY("JD001")
                .build()
        );
        List<STSYS_MAIN_ORG> stsys_main_orgList = stsys_main_org_repository.findAll();

        STSYS_MAIN_ORG stsys_main_org = stsys_main_orgList.get(0);
        assertThat(stsys_main_org.getORG_NM()).isEqualTo("정윤도");
        assertThat(stsys_main_org.getORG_KEY()).isEqualTo("JD001");
    }
}
