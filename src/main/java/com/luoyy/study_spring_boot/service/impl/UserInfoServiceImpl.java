package com.luoyy.study_spring_boot.service.impl;

import com.luoyy.study_spring_boot.dao.UserInfoDao;
import com.luoyy.study_spring_boot.entity.UserInfo;
import com.luoyy.study_spring_boot.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
