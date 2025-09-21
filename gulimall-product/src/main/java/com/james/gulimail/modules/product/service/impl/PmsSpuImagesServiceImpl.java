package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSpuImagesDao;
import com.james.gulimail.modules.product.dto.PmsSpuImagesDTO;
import com.james.gulimail.modules.product.entity.PmsSpuImagesEntity;
import com.james.gulimail.modules.product.service.PmsSpuImagesService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu图片
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSpuImagesServiceImpl extends CrudServiceImpl<PmsSpuImagesDao, PmsSpuImagesEntity, PmsSpuImagesDTO> implements PmsSpuImagesService {

    @Override
    public QueryWrapper<PmsSpuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}