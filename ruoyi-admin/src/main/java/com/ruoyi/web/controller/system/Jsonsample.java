package com.ruoyi.web.controller.system;

import com.alibaba.fastjson.JSONObject;

public class Jsonsample {

    private static JSONObject createJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "huangwuyi");
        jsonObject.put("sex", "男");
        jsonObject.put("QQ", "413425430");
        jsonObject.put("Min.score", new Integer(99));
        jsonObject.put("nickname", "梦中心境");
        return jsonObject;
    }

    public static void main(String[] args) {
        //创建JSONObject
        JSONObject json = new JSONObject();
//添加属性
        json.put("username", "张三");
        json.put("password", "123");
//打印
        //System.out.println(json);




    }
}
