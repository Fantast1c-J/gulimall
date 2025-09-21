package com.james.gulimail.modules.product.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * 品牌分类关联
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@Schema(name = "品牌分类关联")
public class PmsCategoryBrandRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "")
	private Long id;

	@SchemaProperty(name = "品牌id")
	private Long brandId;

	@SchemaProperty(name = "分类id")
	private Long catelogId;

	@SchemaProperty(name = "")
	private String brandName;

	@SchemaProperty(name = "")
	private String catelogName;


}
