package com.luoyy.studyspringboot.service.impl;

import com.luoyy.studyspringboot.dao.UserInfoDao;
import com.luoyy.studyspringboot.entity.UserInfo;
import com.luoyy.studyspringboot.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luosir
 */
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
