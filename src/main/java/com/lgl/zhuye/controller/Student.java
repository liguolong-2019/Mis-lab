package com.lgl.zhuye.controller;

import com.lgl.zhuye.pojo.Graduate;
import com.lgl.zhuye.service.GraduateService;
import com.lgl.zhuye.util.ReturnMapUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @author 李国龙
 */
@RestController
@CrossOrigin
public class Student {

    @Autowired
    GraduateService graduateService;
    @GetMapping("/getStudentInfo")
    public Map getStudentInfo(String xh) {
        return ReturnMapUtil.getSuccessMap(graduateService.getStudentInfo(xh));
    }

    @GetMapping("/listAllStudent")
    public Map listAllStudent() {
        return ReturnMapUtil.getSuccessMap(graduateService.listAllStudent());
    }

}
