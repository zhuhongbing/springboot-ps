package com.zwh.springbootps.dao;

import com.zwh.springbootps.pojo.TbLw;
import com.zwh.springbootps.pojo.TbLwExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TbLwMapper {
    int countByExample(TbLwExample example);

    int deleteByExample(TbLwExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(TbLw record);

    int insertSelective(TbLw record);

    List<TbLw> selectByExample(TbLwExample example);

    TbLw selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") TbLw record, @Param("example") TbLwExample example);

    int updateByExample(@Param("record") TbLw record, @Param("example") TbLwExample example);

    int updateByPrimaryKeySelective(TbLw record);

    int updateByPrimaryKey(TbLw record);
}