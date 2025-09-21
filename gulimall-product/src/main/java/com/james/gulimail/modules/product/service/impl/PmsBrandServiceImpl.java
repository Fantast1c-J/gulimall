package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsBrandDao;
import com.james.gulimail.modules.product.dto.PmsBrandDTO;
import com.james.gulimail.modules.product.entity.PmsBrandEntity;
import com.james.gulimail.modules.product.service.PmsBrandService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsBrandServiceImpl extends CrudServiceImpl<PmsBrandDao, PmsBrandEntity, PmsBrandDTO> implements PmsBrandService {

    @Override
    public QueryWrapper<PmsBrandEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsBrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}