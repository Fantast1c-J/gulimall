package com.james.gulimail.modules.product.dao;

import com.james.gulimail.modules.product.entity.PmsCommentReplayEntity;
import com.james.gulimall.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Mapper
public interface PmsCommentReplayDao extends BaseDao<PmsCommentReplayEntity> {
	
}