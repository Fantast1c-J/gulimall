package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSkuInfoDao;
import com.james.gulimail.modules.product.dto.PmsSkuInfoDTO;
import com.james.gulimail.modules.product.entity.PmsSkuInfoEntity;
import com.james.gulimail.modules.product.service.PmsSkuInfoService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku信息
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSkuInfoServiceImpl extends CrudServiceImpl<PmsSkuInfoDao, PmsSkuInfoEntity, PmsSkuInfoDTO> implements PmsSkuInfoService {

    @Override
    public QueryWrapper<PmsSkuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}