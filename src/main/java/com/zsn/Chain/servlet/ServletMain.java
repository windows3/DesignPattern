package com.zsn.Chain.servlet;


/**
 * @Author: zsn
 * @Date: 2020/5/10 23:17
 */
public class ServletMain {
    public static void main(String[] args) {
//        Msg msg = new Msg();
//        msg.setMsg("大家好:):<script>,欢迎访问 zsn.com ,大家都是996");


        FilterChain fc=new FilterChain();
        fc.add(new HTMLFilter()).add(new URLFilter());


//        fc.doFilter(msg);
//        System.out.println(msg);
    }
}





