package com.james.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.gulimall.coupon.entity.SpuBoundsEntity;
import com.james.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author James
 * @email HeJieLin@gulimall.com
 * @date 2025-05-22 19:35:30
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

