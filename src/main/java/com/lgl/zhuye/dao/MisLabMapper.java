package com.lgl.zhuye.dao;

import com.lgl.zhuye.controller.MisLab;
import com.lgl.zhuye.pojo.MisLabInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 李国龙
 */
@Mapper
@Component
public interface MisLabMapper {
    List<MisLabInfo> getMisLabInfo(String describes);
    List<MisLabInfo> listMisLabInfo();
    List<MisLabInfo> listMisLabProjectInfo(Integer type);
}
