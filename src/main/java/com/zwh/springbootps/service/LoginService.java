package com.zwh.springbootps.service;


import com.zwh.springbootps.pojo.TbUser;

public interface LoginService {

    TbUser Login(TbUser tbUser);

    int Enroll(TbUser tbUser);

    TbUser selectName(String username);

    int upDataInfo(TbUser tbUser);
}
