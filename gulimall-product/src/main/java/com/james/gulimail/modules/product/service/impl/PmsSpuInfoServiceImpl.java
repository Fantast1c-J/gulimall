package com.james.gulimail.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.james.gulimail.modules.product.dao.PmsSpuInfoDao;
import com.james.gulimail.modules.product.dto.PmsSpuInfoDTO;
import com.james.gulimail.modules.product.entity.PmsSpuInfoEntity;
import com.james.gulimail.modules.product.service.PmsSpuInfoService;
import cn.hutool.core.util.StrUtil;
import com.james.gulimall.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu信息
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Service
public class PmsSpuInfoServiceImpl extends CrudServiceImpl<PmsSpuInfoDao, PmsSpuInfoEntity, PmsSpuInfoDTO> implements PmsSpuInfoService {

    @Override
    public QueryWrapper<PmsSpuInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PmsSpuInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}