 package com.james.gulimail.modules.product.controller;


import com.james.gulimail.modules.product.dto.PmsAttrGroupDTO;
import com.james.gulimail.modules.product.excel.PmsAttrGroupExcel;
import com.james.gulimail.modules.product.service.PmsAttrGroupService;
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
 * 属性分组
 *
 * @author James James@gmail.com
 * @since 1.0.0 2025-09-21
 */
@RestController
@RequestMapping("product/pmsattrgroup")
@Tag(name="属性分组")
public class PmsAttrGroupController {
    @Autowired
    private PmsAttrGroupService pmsAttrGroupService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @Parameters({
        @Parameter(name = Constant.PAGE, description = "当前页码，从1开始", in = ParameterIn.QUERY, required = true, ref="int") ,
        @Parameter(name = Constant.LIMIT, description = "每页显示记录数", in = ParameterIn.QUERY,required = true, ref="int") ,
        @Parameter(name = Constant.ORDER_FIELD, description = "排序字段", in = ParameterIn.QUERY, ref="String") ,
        @Parameter(name = Constant.ORDER, description = "排序方式，可选值(asc、desc)", in = ParameterIn.QUERY, ref="String")
    })
    //@RequiresPermissions("product:pmsattrgroup:page")
    public Result<PageData<PmsAttrGroupDTO>> page(@Parameter(hidden = true) @RequestParam Map<String, Object> params){
        PageData<PmsAttrGroupDTO> page = pmsAttrGroupService.page(params);

        return new Result<PageData<PmsAttrGroupDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    //@RequiresPermissions("product:pmsattrgroup:info")
    public Result<PmsAttrGroupDTO> get(@PathVariable("id") Long id){
        PmsAttrGroupDTO data = pmsAttrGroupService.get(id);

        return new Result<PmsAttrGroupDTO>().ok(data);
    }

    @PostMapping
    @Operation(summary = "保存")
    @LogOperation("保存")
    //@RequiresPermissions("product:pmsattrgroup:save")
    public Result save(@RequestBody PmsAttrGroupDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        pmsAttrGroupService.save(dto);

        return new Result();
    }

    @PutMapping
    @Operation(summary = "修改")
    @LogOperation("修改")
    //@RequiresPermissions("product:pmsattrgroup:update")
    public Result update(@RequestBody PmsAttrGroupDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        pmsAttrGroupService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @LogOperation("删除")
    //@RequiresPermissions("product:pmsattrgroup:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        pmsAttrGroupService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @Operation(summary = "导出")
    @LogOperation("导出")
    //@RequiresPermissions("product:pmsattrgroup:export")
    public void export(@Parameter(hidden = true) @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PmsAttrGroupDTO> list = pmsAttrGroupService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "属性分组", list, PmsAttrGroupExcel.class);
    }

}
