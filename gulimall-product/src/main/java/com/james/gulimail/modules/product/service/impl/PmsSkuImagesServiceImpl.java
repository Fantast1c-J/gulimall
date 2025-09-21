package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSkuImagesDao;
import com.james.gulimail.modules.product.dto.PmsSkuImagesDTO;
import com.james.gulimail.modules.product.entity.PmsSkuImagesEntity;
import com.james.gulimail.modules.product.service.PmsSkuImagesService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku图片
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSkuImagesServiceImpl extends CrudServiceImpl<PmsSkuImagesDao, PmsSkuImagesEntity, PmsSkuImagesDTO> implements PmsSkuImagesService {

    @Override
    public QueryWrapper<PmsSkuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSkuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}