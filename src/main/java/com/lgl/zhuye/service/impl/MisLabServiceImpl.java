package com.lgl.zhuye.service.impl;

import com.lgl.zhuye.controller.MisLab;
import com.lgl.zhuye.dao.MisLabMapper;
import com.lgl.zhuye.pojo.MisLabInfo;
import com.lgl.zhuye.service.MisLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李国龙
 */
@Service
public class MisLabServiceImpl implements MisLabService {

    @Autowired
    MisLabMapper misLabMapper;
    @Override
    public List<MisLabInfo> getMisLabInfo(String describes) {
//        if (describe == null || describe.equals("")) {
//            return null;
//        }
        return misLabMapper.getMisLabInfo(describes);
    }

    @Override
    public List<MisLabInfo> listMisLabInfo() {
        return misLabMapper.listMisLabInfo();
    }

    @Override
    public List<MisLabInfo> listMisLabProjectInfo() {
        return misLabMapper.listMisLabProjectInfo(2);
    }
}
