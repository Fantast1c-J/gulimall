package com.james.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.gulimall.coupon.dao.SpuBoundsDao;
import com.james.gulimall.coupon.entity.SpuBoundsEntity;
import com.james.gulimall.coupon.service.SpuBoundsService;
import com.james.gulimall.common.utils.PageUtils;
import com.james.gulimall.common.utils.Query;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        QueryWrapper<SpuBoundsEntity> queryWrapper = new QueryWrapper<>();

        String key = (String) params.get("key");

        if (!StringUtils.isEmpty(key)) {
            queryWrapper.eq("id",key).or().eq("sku_id",key);
        }

        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

}