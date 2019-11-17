package com.yoona.dao;

import com.yoona.entity.TbBrand;
import java.util.List;

public interface TbBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    List<TbBrand> selectAll();

    int updateByPrimaryKey(TbBrand record);
}