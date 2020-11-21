package com.lgl.zhuye.service;

import com.lgl.zhuye.pojo.MisLabInfo;

import java.util.List;

/**
 * @author 李国龙
 */
public interface MisLabService {
    /**
     * 得到所描述方向的全部信息
     * @param describes
     * @return
     */
    List<MisLabInfo> getMisLabInfo(String describes);

    List<MisLabInfo> listMisLabInfo();

    List<MisLabInfo> listMisLabProjectInfo();
}
