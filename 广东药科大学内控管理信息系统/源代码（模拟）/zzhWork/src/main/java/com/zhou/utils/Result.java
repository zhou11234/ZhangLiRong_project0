package com.zhou.utils;

import com.alibaba.fastjson2.JSONObject;

import java.util.HashMap;
import java.util.Map;

//用于返回成功失败等信息
public class Result {

    public static String okGetString(String message){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message",message);
        String s = JSONObject.toJSONString(map);
        return s;
    }

    public static String okGetStringByData(String message,Object data){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message",message);
        map.put("data",data);
        String s = JSONObject.toJSONString(map);
        return s;
    }

}
