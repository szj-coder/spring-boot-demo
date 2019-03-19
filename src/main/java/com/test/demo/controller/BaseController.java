package com.test.demo.controller;

import com.alibaba.fastjson.JSONObject;

import java.util.Collections;

public class BaseController {

    protected String successReturn() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        return jsonObject.toJSONString();
    }

    protected String successReturn(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("msg", msg);
        return jsonObject.toJSONString();
    }

    protected String successReture(Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);

        if (data instanceof Collections) {
            JSONObject subDataObj = new JSONObject();
            subDataObj.put("list", data);
            jsonObject.put("data", subDataObj);
        } else {
            jsonObject.put("data", data);
        }
        jsonObject.put("msg", "");

        return jsonObject.toJSONString();
    }

    protected String failReturn(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 500);
        jsonObject.put("msg", msg);
        return jsonObject.toJSONString();
    }
}
