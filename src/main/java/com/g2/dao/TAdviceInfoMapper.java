package com.g2.dao;

import org.wcy.gen.model.TAdviceInfo;

public interface TAdviceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAdviceInfo record);

    int insertSelective(TAdviceInfo record);

    TAdviceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAdviceInfo record);

    int updateByPrimaryKey(TAdviceInfo record);
}