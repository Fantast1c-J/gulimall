package com.james.gulimail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.james.gulimall.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author James
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
