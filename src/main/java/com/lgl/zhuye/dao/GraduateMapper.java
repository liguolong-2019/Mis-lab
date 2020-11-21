package com.lgl.zhuye.dao;


import com.lgl.zhuye.pojo.Graduate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 李国龙
 */

@Mapper
@Component
public interface GraduateMapper {

    Graduate getStudentInfo(String xh);

    List<Graduate> listAllStudent();
}
