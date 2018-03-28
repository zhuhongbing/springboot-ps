package com.zwh.springbootps.service;

import com.zwh.springbootps.pojo.TbImg;

import java.util.List;

public interface ImgService {

    int insert(TbImg tbImg);

    List<TbImg> getImgList(String cate);
}
