package com.lgl.zhuye.util;

import io.swagger.annotations.ApiModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李国龙
 */
public class ReturnMapUtil {
    public static Map getSuccessMap(Object o){
        Map<String, Object> map = new HashMap(3);
        map.put("code", 1);
        map.put("msg", "success");
        map.put("data", o);
        return map;
    }

    public static Map getFalseMap(String msg){
        Map<String, Object> map = new HashMap(3);
        map.put("code", 0);
        map.put("msg", msg);
        map.put("data", null);
        return map;
    }

    public static Map getExceptionMap(StackTraceElement[] stackTrace) {
        Map<String, Object> map = new HashMap(3);
        map.put("code", 0);
        map.put("msg", "服务器异常");
        map.put("data", stackTrace);
        return map;
    }
}
