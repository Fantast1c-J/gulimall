package com.james.gulimail.modules.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 属性&属性分组关联
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
public class PmsAttrAttrgroupRelationExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "属性id")
    private Long attrId;
    @ExcelProperty(value = "属性分组id")
    private Long attrGroupId;
    @ExcelProperty(value = "属性组内排序")
    private Integer attrSort;

}