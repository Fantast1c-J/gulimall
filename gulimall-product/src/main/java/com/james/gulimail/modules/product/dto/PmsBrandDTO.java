package com.james.gulimail.modules.product.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * 品牌
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@Schema(name = "品牌")
public class PmsBrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "品牌id")
	private Long brandId;

	@SchemaProperty(name = "品牌名")
	private String name;

	@SchemaProperty(name = "品牌logo地址")
	private String logo;

	@SchemaProperty(name = "介绍")
	private String descript;

	@SchemaProperty(name = "显示状态[0-不显示；1-显示]")
	private Integer showStatus;

	@SchemaProperty(name = "检索首字母")
	private String firstLetter;

	@SchemaProperty(name = "排序")
	private Integer sort;


}
