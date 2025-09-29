package com.james.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.gulimall.common.utils.PageUtils;
import com.james.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author James
 * @email James@gmail.com
 * @date 2025-09-23 20:46:22
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

