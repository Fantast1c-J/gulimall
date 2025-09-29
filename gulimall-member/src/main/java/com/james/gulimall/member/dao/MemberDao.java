package com.james.gulimall.member.dao;

import com.james.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author James
 * @email James@gmail.com
 * @date 2025-09-23 20:46:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
