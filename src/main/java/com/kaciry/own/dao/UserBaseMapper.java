package com.kaciry.own.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaciry.own.model.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Kaciry Smith
 * @create 2021-10-30 1:43 下午
 */
@Mapper
public interface UserBaseMapper extends BaseMapper<User> {
}
