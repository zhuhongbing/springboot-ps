package com.zwh.springbootps.service.Impl;

import com.zwh.springbootps.dao.TbImgMapper;
import com.zwh.springbootps.pojo.TbImg;
import com.zwh.springbootps.pojo.TbImgExample;
import com.zwh.springbootps.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private TbImgMapper tbImgMapper;

    @Override
    public int insert(TbImg tbImg) {
        return tbImgMapper.insert(tbImg);
    }

    @Override
    public List<TbImg> getImgList(String cate) {
        TbImgExample tbImgExample = new TbImgExample();
        if (cate!=null){
            TbImgExample.Criteria c= tbImgExample.createCriteria();
            c.andImgcateLike(cate);
        }
        List<TbImg> imgList = tbImgMapper.selectByExample(tbImgExample);
        return imgList;
    }
}
