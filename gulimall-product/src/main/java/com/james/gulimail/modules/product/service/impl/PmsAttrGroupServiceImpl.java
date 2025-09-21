package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsAttrGroupDao;
import com.james.gulimail.modules.product.dto.PmsAttrGroupDTO;
import com.james.gulimail.modules.product.entity.PmsAttrGroupEntity;
import com.james.gulimail.modules.product.service.PmsAttrGroupService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 属性分组
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsAttrGroupServiceImpl extends CrudServiceImpl<PmsAttrGroupDao, PmsAttrGroupEntity, PmsAttrGroupDTO> implements PmsAttrGroupService {

    @Override
    public QueryWrapper<PmsAttrGroupEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsAttrGroupEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}