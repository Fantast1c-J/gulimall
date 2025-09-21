package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsCategoryDao;
import com.james.gulimail.modules.product.dto.PmsCategoryDTO;
import com.james.gulimail.modules.product.entity.PmsCategoryEntity;
import com.james.gulimail.modules.product.service.PmsCategoryService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsCategoryServiceImpl extends CrudServiceImpl<PmsCategoryDao, PmsCategoryEntity, PmsCategoryDTO> implements PmsCategoryService {

    @Override
    public QueryWrapper<PmsCategoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsCategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}