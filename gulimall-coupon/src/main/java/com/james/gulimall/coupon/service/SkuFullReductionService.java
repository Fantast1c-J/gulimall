package com.james.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.gulimall.coupon.entity.SkuFullReductionEntity;
import com.james.gulimall.common.to.SkuReductionTo;;
import com.james.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author James
 * @email HeJieLin@gulimall.com
 * @date 2025-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

