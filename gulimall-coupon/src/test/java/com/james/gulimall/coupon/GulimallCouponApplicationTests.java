package com.james.gulimall.coupon;

import com.james.gulimall.coupon.dao.SmsCouponDao;
import com.james.gulimall.coupon.entity.SmsCouponEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallCouponApplicationTests {

    @Autowired
    private SmsCouponDao smsCouponDao;

    @Test
    public void contextLoads() {
        SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
        smsCouponEntity.setCouponName("conName");
        smsCouponDao.insert(smsCouponEntity);
    }

}
