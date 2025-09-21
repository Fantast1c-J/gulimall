package com.james.gulimail.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 品牌
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
@TableName("pms_brand")
public class PmsBrandEntity {

    /**
     * 品牌id
     */
	private Long brandId;
    /**
     * 品牌名
     */
	private String name;
    /**
     * 品牌logo地址
     */
	private String logo;
    /**
     * 介绍
     */
	private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
	private Integer showStatus;
    /**
     * 检索首字母
     */
	private String firstLetter;
    /**
     * 排序
     */
	private Integer sort;
}