package com.james.gulimail.modules.product.service.impl;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsCategoryBrandRelationDao;
import com.james.gulimail.modules.product.dto.PmsCategoryBrandRelationDTO;
import com.james.gulimail.modules.product.entity.PmsCategoryBrandRelationEntity;
import com.james.gulimail.modules.product.service.PmsCategoryBrandRelationService;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsCategoryBrandRelationServiceImpl extends CrudServiceImpl<PmsCategoryBrandRelationDao, PmsCategoryBrandRelationEntity, PmsCategoryBrandRelationDTO> implements PmsCategoryBrandRelationService {

    @Override
    public QueryWrapper<PmsCategoryBrandRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCategoryBrandRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}