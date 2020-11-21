package com.lgl.zhuye.controller;

import com.lgl.zhuye.pojo.MisLabInfo;
import com.lgl.zhuye.service.MisLabService;
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
public class MisLab {

    @Autowired
    MisLabService misLabService;

    @GetMapping("/getMisLabInfo")
    public Map getMisLabInfo(String describes) {
        return ReturnMapUtil.getSuccessMap(misLabService.getMisLabInfo(describes));
    }

    @GetMapping("/listMisLabInfo")
    public Map listMisLabInfo() {
        return ReturnMapUtil.getSuccessMap(misLabService.listMisLabInfo());
    }

    @GetMapping("/listMisLabProjectInfo")
    public Map listMisLabProjectInfo() {
        return ReturnMapUtil.getSuccessMap(misLabService.listMisLabProjectInfo());
    }
}
