package com.mooc.jiangzh.dubbo.service.impl;

import com.mooc.jiangzh.dubbo.service.ISendMsg;

public class ISendMsgImpl implements ISendMsg {
    @Override
    public String sendMsg(String msg) {
        return "francis msg is : "+msg;
    }
}
