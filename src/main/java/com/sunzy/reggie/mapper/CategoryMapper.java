package com.sunzy.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunzy.reggie.domain.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
