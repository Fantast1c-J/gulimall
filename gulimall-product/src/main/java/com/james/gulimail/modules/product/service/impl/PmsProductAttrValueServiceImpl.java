package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsProductAttrValueDao;
import com.james.gulimail.modules.product.dto.PmsProductAttrValueDTO;
import com.james.gulimail.modules.product.entity.PmsProductAttrValueEntity;
import com.james.gulimail.modules.product.service.PmsProductAttrValueService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu属性值
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsProductAttrValueServiceImpl extends CrudServiceImpl<PmsProductAttrValueDao, PmsProductAttrValueEntity, PmsProductAttrValueDTO> implements PmsProductAttrValueService {

    @Override
    public QueryWrapper<PmsProductAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsProductAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}