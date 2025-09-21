 package com.james.gulimail.modules.product.controller;


import com.james.gulimail.modules.product.dto.PmsSpuInfoDescDTO;
import com.james.gulimail.modules.product.excel.PmsSpuInfoDescExcel;
import com.james.gulimail.modules.product.service.PmsSpuInfoDescService;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.james.gulimall.common.annotation.LogOperation;
import com.james.gulimall.common.constant.Constant;
import com.james.gulimall.common.page.PageData;
import com.james.gulimall.common.utils.ExcelUtils;
import com.james.gulimall.common.utils.Result;
import com.james.gulimall.common.validator.AssertUtils;
import com.james.gulimall.common.validator.ValidatorUtils;
import com.james.gulimall.common.validator.group.AddGroup;
import com.james.gulimall.common.validator.group.DefaultGroup;
import com.james.gulimall.common.validator.group.UpdateGroup;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * spu信息介绍
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@RestController
@RequestMapping("product/pmsspuinfodesc")
@Tag(name="spu信息介绍")
public class PmsSpuInfoDescController {
    @Autowired
    private PmsSpuInfoDescService pmsSpuInfoDescService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
    //@RequiresPermissions("product:pmsspuinfodesc:page")
    public Result<PageData<PmsSpuInfoDescDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsSpuInfoDescDTO> page = pmsSpuInfoDescService.page(params);

        return new Result<PageData<PmsSpuInfoDescDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    //@RequiresPermissions("product:pmsspuinfodesc:info")
    public Result<PmsSpuInfoDescDTO> get(@PathVariable("id") Long id){
        PmsSpuInfoDescDTO data = pmsSpuInfoDescService.get(id);

        return new Result<PmsSpuInfoDescDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
    //@RequiresPermissions("product:pmsspuinfodesc:save")
    public Result save(@RequestBody PmsSpuInfoDescDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsSpuInfoDescService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
    //@RequiresPermissions("product:pmsspuinfodesc:update")
    public Result update(@RequestBody PmsSpuInfoDescDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsSpuInfoDescService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
    //@RequiresPermissions("product:pmsspuinfodesc:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsSpuInfoDescService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
    //@RequiresPermissions("product:pmsspuinfodesc:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsSpuInfoDescDTO> list = pmsSpuInfoDescService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "spu信息介绍", list, PmsSpuInfoDescExcel.class);
    }

}
