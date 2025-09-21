package com.james.gulimail.modules.product.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * spu图片
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@Schema(name = "spu图片")
public class PmsSpuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "spu_id")
	private Long spuId;

	@SchemaProperty(name = "图片名")
	private String imgName;

	@SchemaProperty(name = "图片地址")
	private String imgUrl;

	@SchemaProperty(name = "顺序")
	private Integer imgSort;

	@SchemaProperty(name = "是否默认图")
	private Integer defaultImg;


}
