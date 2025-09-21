package com.james.gulimail.modules.product.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价回复关系
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@Data
public class PmsCommentReplayExcel {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "评论id")
    private Long commentId;
    @ExcelProperty(value = "回复id")
    private Long replyId;

}