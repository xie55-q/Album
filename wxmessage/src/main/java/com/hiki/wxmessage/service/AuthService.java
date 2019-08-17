package com.hiki.wxmessage.service;

import com.hiki.wxmessage.entity.Users;

/**
 * @author ：hiki
 * 2019/8/16 16:27
 */
public interface AuthService {
    /**
     * 通过username获取用户信息
     * @param username
     * @return
     */
    public Users getUserByUsername(String username);

    /**
     * 检查账号密码是否正确
     * @param username
     * @param password
     * @param created
     * @param passSalt
     * @param passHash
     * @return
     */
    public Boolean checkPassword(String username, String password, int created, String passSalt, String passHash);

    /**
     * 注册用户
     * @param username
     * @param password
     * @param name
     * @return
     */
    public Boolean register(String username, String password, String name);
}