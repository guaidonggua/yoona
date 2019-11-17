package com.yoona.dao;

import com.yoona.entity.Star;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StarMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Star record);

    Star selectByPrimaryKey(Integer sid);

    List<Star> selectAll();

    int updateByPrimaryKey(Star record);
}