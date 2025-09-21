 package com.james.gulimail.modules.product.controller;


import com.james.gulimail.modules.product.dto.PmsSpuInfoDTO;
import com.james.gulimail.modules.product.excel.PmsSpuInfoExcel;
import com.james.gulimail.modules.product.service.PmsSpuInfoService;
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
 * spu信息
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@RestController
@RequestMapping("product/pmsspuinfo")
@Tag(name="spu信息")
public class PmsSpuInfoController {
    @Autowired
    private PmsSpuInfoService pmsSpuInfoService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
    //@RequiresPermissions("product:pmsspuinfo:page")
    public Result<PageData<PmsSpuInfoDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsSpuInfoDTO> page = pmsSpuInfoService.page(params);

        return new Result<PageData<PmsSpuInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    //@RequiresPermissions("product:pmsspuinfo:info")
    public Result<PmsSpuInfoDTO> get(@PathVariable("id") Long id){
        PmsSpuInfoDTO data = pmsSpuInfoService.get(id);

        return new Result<PmsSpuInfoDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
    //@RequiresPermissions("product:pmsspuinfo:save")
    public Result save(@RequestBody PmsSpuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsSpuInfoService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
    //@RequiresPermissions("product:pmsspuinfo:update")
    public Result update(@RequestBody PmsSpuInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsSpuInfoService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
    //@RequiresPermissions("product:pmsspuinfo:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsSpuInfoService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
    //@RequiresPermissions("product:pmsspuinfo:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsSpuInfoDTO> list = pmsSpuInfoService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "spu信息", list, PmsSpuInfoExcel.class);
    }

}
