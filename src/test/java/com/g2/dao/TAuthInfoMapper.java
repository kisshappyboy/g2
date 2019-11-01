package com.g2.dao;

import org.wcy.gen.model.TAuthInfo;

public interface TAuthInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAuthInfo record);

    int insertSelective(TAuthInfo record);

    TAuthInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAuthInfo record);

    int updateByPrimaryKey(TAuthInfo record);
}