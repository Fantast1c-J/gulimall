package com.james.gulimail.modules.product.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;

/**
 * 商品评价回复关系
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@Schema(name = "商品评价回复关系")
public class PmsCommentReplayDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@SchemaProperty(name = "id")
	private Long id;

	@SchemaProperty(name = "评论id")
	private Long commentId;

	@SchemaProperty(name = "回复id")
	private Long replyId;


}
