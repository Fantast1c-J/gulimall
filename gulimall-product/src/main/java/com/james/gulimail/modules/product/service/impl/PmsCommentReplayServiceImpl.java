package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsCommentReplayDao;
import com.james.gulimail.modules.product.dto.PmsCommentReplayDTO;
import com.james.gulimail.modules.product.entity.PmsCommentReplayEntity;
import com.james.gulimail.modules.product.service.PmsCommentReplayService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsCommentReplayServiceImpl extends CrudServiceImpl<PmsCommentReplayDao, PmsCommentReplayEntity, PmsCommentReplayDTO> implements PmsCommentReplayService {

    @Override
    public QueryWrapper<PmsCommentReplayEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCommentReplayEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}