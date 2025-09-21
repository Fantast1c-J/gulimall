package com.james.gulimail.modules.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 品牌分类关联
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
public class PmsCategoryBrandRelationExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "品牌id")
    private Long brandId;
    @ExcelProperty(value = "分类id")
    private Long catelogId;
    @ExcelProperty(value = "")
    private String brandName;
    @ExcelProperty(value = "")
    private String catelogName;

}