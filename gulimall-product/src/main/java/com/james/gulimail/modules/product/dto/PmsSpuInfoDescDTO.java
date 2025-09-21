package com.james.gulimail.modules.product.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * spu信息介绍
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@Schema(name = "spu信息介绍")
public class PmsSpuInfoDescDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "商品id")
	private Long spuId;

	@SchemaProperty(name = "商品介绍")
	private String decript;


}
