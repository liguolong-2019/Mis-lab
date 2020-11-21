package com.lgl.zhuye.service.impl;

import com.lgl.zhuye.dao.AccountMapper;
import com.lgl.zhuye.pojo.Account;
import com.lgl.zhuye.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李国龙
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account getAccountByXh(String xh) {
        return accountMapper.getAccountByXh(xh);
    }

    @Override
    public boolean login(String xh, String password) {
        if (xh == null || password == null || xh.equals("") || password.equals("")) {
            return false;
        }
        Account accountByXh = accountMapper.getAccountByXh(xh);
        if (accountByXh == null) {
            return false;
        } else if (!accountByXh.getPassword().equals(password)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean register(String xh, String password, String name) {
        if (xh == null || xh.equals("") || password == null || password.equals("") || name == null || name.equals("")) {
            return false;
        }
        Account accountByXh = accountMapper.getAccountByXh(xh);
        if (accountByXh != null) {
            return false;
        }
        Account build = Account.builder()
                .xh(xh)
                .password(password)
                .name(name)
                .build();
        boolean result = accountMapper.addAccount(build);
        if (!result) {
            return false;
        }
        return true;
    }
}
