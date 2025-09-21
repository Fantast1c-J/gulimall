package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSpuInfoDescDao;
import com.james.gulimail.modules.product.dto.PmsSpuInfoDescDTO;
import com.james.gulimail.modules.product.entity.PmsSpuInfoDescEntity;
import com.james.gulimail.modules.product.service.PmsSpuInfoDescService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSpuInfoDescServiceImpl extends CrudServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDescEntity, PmsSpuInfoDescDTO> implements PmsSpuInfoDescService {

    @Override
    public QueryWrapper<PmsSpuInfoDescEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuInfoDescEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}