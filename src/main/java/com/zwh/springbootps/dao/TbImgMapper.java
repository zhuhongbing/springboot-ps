package com.zwh.springbootps.dao;

import com.zwh.springbootps.pojo.TbImg;
import com.zwh.springbootps.pojo.TbImgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TbImgMapper {
    int countByExample(TbImgExample example);

    int deleteByExample(TbImgExample example);

    int deleteByPrimaryKey(Integer imgid);

    int insert(TbImg record);

    int insertSelective(TbImg record);

    List<TbImg> selectByExample(TbImgExample example);

    TbImg selectByPrimaryKey(Integer imgid);

    int updateByExampleSelective(@Param("record") TbImg record, @Param("example") TbImgExample example);

    int updateByExample(@Param("record") TbImg record, @Param("example") TbImgExample example);

    int updateByPrimaryKeySelective(TbImg record);

    int updateByPrimaryKey(TbImg record);
}