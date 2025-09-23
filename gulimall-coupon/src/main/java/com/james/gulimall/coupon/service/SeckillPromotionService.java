package com.james.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.gulimall.coupon.entity.SeckillPromotionEntity;
import com.james.gulimall.common.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author James
 * @email HeJieLin@gulimall.com
 * @date 2025-05-22 19:35:30
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

