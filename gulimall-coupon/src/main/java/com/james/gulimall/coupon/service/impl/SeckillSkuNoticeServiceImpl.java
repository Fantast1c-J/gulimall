package com.james.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.gulimall.coupon.dao.SeckillSkuNoticeDao;
import com.james.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.james.gulimall.coupon.service.SeckillSkuNoticeService;
import com.james.gulimall.common.utils.PageUtils;
import com.james.gulimall.common.utils.Query;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNoticeEntity> page = this.page(
                new Query<SeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}