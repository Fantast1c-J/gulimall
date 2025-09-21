package com.james.gulimail.product;

import com.james.gulimail.modules.product.GulimallProductApplication;
import com.james.gulimail.modules.product.entity.PmsAttrEntity;
import com.james.gulimail.modules.product.service.PmsAttrService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
public class GulimallProductApplicationTests {

    @Resource
    private PmsAttrService pmsAttrService;
    @Test
   public void contextLoads() {
        PmsAttrEntity pmsAttrEntity = new PmsAttrEntity();
        pmsAttrEntity.setAttrName("测试");
        pmsAttrService.insert(pmsAttrEntity);
        log.info("保存成功");
    }

}
