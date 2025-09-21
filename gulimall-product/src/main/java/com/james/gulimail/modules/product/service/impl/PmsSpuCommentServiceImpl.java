package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSpuCommentDao;
import com.james.gulimail.modules.product.dto.PmsSpuCommentDTO;
import com.james.gulimail.modules.product.entity.PmsSpuCommentEntity;
import com.james.gulimail.modules.product.service.PmsSpuCommentService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSpuCommentServiceImpl extends CrudServiceImpl<PmsSpuCommentDao, PmsSpuCommentEntity, PmsSpuCommentDTO> implements PmsSpuCommentService {

    @Override
    public QueryWrapper<PmsSpuCommentEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuCommentEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}