package com.james.gulimall.coupon.controller;

import com.james.gulimall.common.utils.PageUtils;
import com.james.gulimall.common.utils.R;
import com.james.gulimall.coupon.entity.SmsCouponEntity;
import com.james.gulimall.coupon.service.SmsCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 优惠券信息
 *
 * @author James
 * @email James@gmail.com
 * @date 2025-09-24 20:53:37
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;
    /**
     * test列表
     */
    @Value("${coupon.user.name}")
    public String name;
    @RequestMapping("/testCouponNacosConf")
    public R testCouponNacosConf(){
        return R.ok().put("coupon", name);
    }
    @RequestMapping("/test/list")
    public R test(){
        SmsCouponEntity smsCouponEntity = new SmsCouponEntity();
        smsCouponEntity.setCouponName("满一百减1000");
        return R.ok().put("coupon", smsCouponEntity);
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smscoupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smscoupon:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smscoupon:save")
    public R save(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smscoupon:update")
    public R update(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smscoupon:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
