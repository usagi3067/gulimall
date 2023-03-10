package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dango
 * @email a15521474798@outlook.com
 * @date 2023-03-09 19:39:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
