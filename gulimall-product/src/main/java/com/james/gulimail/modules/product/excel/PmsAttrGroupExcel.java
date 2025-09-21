package com.james.gulimail.modules.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 属性分组
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
public class PmsAttrGroupExcel {
    @ExcelProperty(value = "分组id")
    private Long attrGroupId;
    @ExcelProperty(value = "组名")
    private String attrGroupName;
    @ExcelProperty(value = "排序")
    private Integer sort;
    @ExcelProperty(value = "描述")
    private String descript;
    @ExcelProperty(value = "组图标")
    private String icon;
    @ExcelProperty(value = "所属分类id")
    private Long catelogId;

}