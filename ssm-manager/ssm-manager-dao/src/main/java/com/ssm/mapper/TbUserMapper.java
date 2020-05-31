package com.ssm.mapper;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {

    User findUserById(@Param("id") int id);
}
