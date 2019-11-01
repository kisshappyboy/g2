package com.g2.dao;

import org.wcy.gen.model.TGradeInfo;

public interface TGradeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TGradeInfo record);

    int insertSelective(TGradeInfo record);

    TGradeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGradeInfo record);

    int updateByPrimaryKey(TGradeInfo record);
}