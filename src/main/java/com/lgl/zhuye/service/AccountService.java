package com.lgl.zhuye.service;

import com.lgl.zhuye.pojo.Account;

/**
 * @author 李国龙
 */
public interface AccountService {
    /**
     * 根据学号返回用户信息
     * @return
     */
    Account getAccountByXh(String xh);

    /**
     * 用户登录服务
     * @param xh
     * @param password
     * @return
     */
    boolean login(String xh, String password);

    /**
     * 新用户注册
     * @param xh 学生学号
     * @param password 密码
     * @param name 姓名
     * @return
     */
    boolean register(String xh, String password, String name);
}
