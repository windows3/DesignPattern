package com.zsn.Chain;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:39
 */
public class Msg {

    String name;
    String msg;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}