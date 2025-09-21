package com.james.gulimail.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * spu信息介绍
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@TableName("pms_spu_info_desc")
public class PmsSpuInfoDescEntity {

    /**
     * 商品id
     */
	private Long spuId;
    /**
     * 商品介绍
     */
	private String decript;
}