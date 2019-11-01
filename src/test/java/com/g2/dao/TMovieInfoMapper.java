package com.g2.dao;

import org.wcy.gen.model.TMovieInfo;

public interface TMovieInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TMovieInfo record);

    int insertSelective(TMovieInfo record);

    TMovieInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TMovieInfo record);

    int updateByPrimaryKey(TMovieInfo record);
}