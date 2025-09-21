package com.james.gulimail.modules.product.dao;

import com.james.gulimail.modules.product.entity.PmsCategoryEntity;
import com.james.gulimall.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Mapper
public interface PmsCategoryDao extends BaseDao<PmsCategoryEntity> {
	
}