package com.zwh.springbootps.service.Impl;

import com.zwh.springbootps.dao.TbUserMapper;
import com.zwh.springbootps.pojo.TbUser;
import com.zwh.springbootps.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public TbUser Login(TbUser tbUser) {
        return tbUserMapper.Login(tbUser);
    }

    @Override
    public int Enroll(TbUser tbUser) {
        return tbUserMapper.insert(tbUser);
    }

    @Override
    public TbUser selectName(String username) {
        return null;
    }

    @Override
    public int upDataInfo(TbUser tbUser) {
        return tbUserMapper.updateByPrimaryKey(tbUser);
    }
}
