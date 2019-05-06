package com.bill.system.dao;

import com.bill.system.entity.User;
import com.bill.system.entity.UserWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String accountnumber);

    UserWithBLOBs selectByPrimaryKey(String accountnumber);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}