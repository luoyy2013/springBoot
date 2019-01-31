package com.luoyy.study_spring_boot.service;

import com.luoyy.study_spring_boot.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);
}
