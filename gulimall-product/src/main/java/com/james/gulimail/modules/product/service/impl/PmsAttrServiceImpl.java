package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsAttrDao;
import com.james.gulimail.modules.product.dto.PmsAttrDTO;
import com.james.gulimail.modules.product.entity.PmsAttrEntity;
import com.james.gulimail.modules.product.service.PmsAttrService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品属性
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsAttrServiceImpl extends CrudServiceImpl<PmsAttrDao, PmsAttrEntity, PmsAttrDTO> implements PmsAttrService {

    @Override
    public QueryWrapper<PmsAttrEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}