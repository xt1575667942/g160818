package com.zking.crm.mapper;

import com.zking.crm.model.Read;

public interface ReadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Read record);

    int insertSelective(Read record);

    Read selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Read record);

    int updateByPrimaryKey(Read record);
}