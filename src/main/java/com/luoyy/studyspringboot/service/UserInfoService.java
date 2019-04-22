package com.luoyy.studyspringboot.service;

import com.luoyy.studyspringboot.entity.UserInfo;

/**
 * @author luosir
 */
public interface UserInfoService {
    /**
     * 通过username查找用户信息;
     * @param username 用户名
     * @return         对应的用户对象
     */
    UserInfo findByUsername(String username);
}
