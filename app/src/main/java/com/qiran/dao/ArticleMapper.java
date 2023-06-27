package com.qiran.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiran.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<User> {
}
