package com.lgl.zhuye.service.impl;

import com.lgl.zhuye.dao.GraduateMapper;
import com.lgl.zhuye.pojo.Graduate;
import com.lgl.zhuye.service.GraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李国龙
 */
@Service
public class GraduateServiceImpl implements GraduateService {

    @Autowired
    GraduateMapper graduateMapper;
    @Override
    public Graduate getStudentInfo(String xh) {
        return graduateMapper.getStudentInfo(xh);
    }

    @Override
    public List<Graduate> listAllStudent() {
        return graduateMapper.listAllStudent();
    }
}
