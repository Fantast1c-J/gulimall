package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsAttrAttrgroupRelationDao;
import com.james.gulimail.modules.product.dto.PmsAttrAttrgroupRelationDTO;
import com.james.gulimail.modules.product.entity.PmsAttrAttrgroupRelationEntity;
import com.james.gulimail.modules.product.service.PmsAttrAttrgroupRelationService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsAttrAttrgroupRelationServiceImpl extends CrudServiceImpl<PmsAttrAttrgroupRelationDao, PmsAttrAttrgroupRelationEntity, PmsAttrAttrgroupRelationDTO> implements PmsAttrAttrgroupRelationService {

    @Override
    public QueryWrapper<PmsAttrAttrgroupRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrAttrgroupRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}