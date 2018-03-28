package com.zwh.springbootps.service.Impl;

import com.zwh.springbootps.dao.TbLwMapper;
import com.zwh.springbootps.pojo.TbLw;
import com.zwh.springbootps.pojo.TbLwExample;
import com.zwh.springbootps.service.LeaveWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveWordServiceImpl implements LeaveWordService {
    @Autowired
    private TbLwMapper tbLwMapper;

    @Override
    public Integer setLW(TbLw tbLw) {
        return tbLwMapper.insert(tbLw);
    }

    @Override
    public List<TbLw> getLwList(TbLwExample tbLwExample) {
        List<TbLw> list =  tbLwMapper.selectByExample(tbLwExample);
        return list;
    }
}
