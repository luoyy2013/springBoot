package com.luoyy.studyspringboot.dao;

import com.luoyy.studyspringboot.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author luosir
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**
     * 通过username查找用户信息;
     * @param username 用户名称
     * @return         通过uerName查找到这个user的对象
     */
    UserInfo findByUsername(String username);
}
