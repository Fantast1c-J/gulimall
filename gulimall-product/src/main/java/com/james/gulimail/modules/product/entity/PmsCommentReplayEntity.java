package com.james.gulimail.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价回复关系
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@TableName("pms_comment_replay")
public class PmsCommentReplayEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 评论id
     */
	private Long commentId;
    /**
     * 回复id
     */
	private Long replyId;
}