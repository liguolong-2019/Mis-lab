package com.lgl.zhuye.service;

import com.lgl.zhuye.pojo.Graduate;

import java.util.List;

/**
 * @author 李国龙
 */
public interface GraduateService {

    /**
     * 根据学号获得信息
     * @param xh
     * @return
     */
    Graduate getStudentInfo(String xh);

    List<Graduate> listAllStudent();
}
