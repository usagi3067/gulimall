package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dango
 * @email a15521474798@outlook.com
 * @date 2023-03-09 15:06:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
