package com.g2.dao;

import org.wcy.gen.model.TRoleInfo;

public interface TRoleInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRoleInfo record);

    int insertSelective(TRoleInfo record);

    TRoleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRoleInfo record);

    int updateByPrimaryKey(TRoleInfo record);
}