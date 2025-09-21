package com.james.gulimail.modules.product.service.impl;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSkuSaleAttrValueDao;
import com.james.gulimail.modules.product.dto.PmsSkuSaleAttrValueDTO;
import com.james.gulimail.modules.product.entity.PmsSkuSaleAttrValueEntity;
import com.james.gulimail.modules.product.service.PmsSkuSaleAttrValueService;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSkuSaleAttrValueServiceImpl extends CrudServiceImpl<PmsSkuSaleAttrValueDao, PmsSkuSaleAttrValueEntity, PmsSkuSaleAttrValueDTO> implements PmsSkuSaleAttrValueService {

    @Override
    public QueryWrapper<PmsSkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}