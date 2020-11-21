package com.lgl.zhuye.controller;

import com.lgl.zhuye.service.AccountService;
import com.lgl.zhuye.util.ReturnMapUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 李国龙
 */
@RestController
@CrossOrigin
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/login")
    public Map accountLogin(@ApiParam("学生学号") String xh,@ApiParam("密码") String password) {
        boolean login = accountService.login(xh, password);
        if (login) {
            return ReturnMapUtil.getSuccessMap(accountService.getAccountByXh(xh));
        } else {
            return ReturnMapUtil.getFalseMap("登录失败");
        }
    }

    @PostMapping("/register")
    public Map accountRegister(String xh, String password, String name) {
        boolean register = accountService.register(xh, password, name);
        if (register) {
            return ReturnMapUtil.getSuccessMap(accountService.getAccountByXh(xh));
        } else {
            return ReturnMapUtil.getFalseMap("注册失败");
        }
    }
}
