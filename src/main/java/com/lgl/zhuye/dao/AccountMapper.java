package com.lgl.zhuye.dao;

import com.lgl.zhuye.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 李国龙
 */
@Mapper
@Component
public interface AccountMapper {
    /**
     * 根据学号返回用户信息
     * @param xh 用户学号
     * @return
     */
    Account getAccountByXh(String xh);

    /**
     * 添加新用户
     * @param account 封装的用户信息
     * @return
     */
    boolean addAccount(Account account);
}
