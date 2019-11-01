package com.g2.dao;

import org.wcy.gen.model.TUserInfo;

public interface TUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserInfo record);

    int insertSelective(TUserInfo record);

    TUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserInfo record);

    int updateByPrimaryKey(TUserInfo record);
}