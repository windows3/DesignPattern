package com.zsn.Chain;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:34
 */
public class SensitiveFilter implements MyFilter {


    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("996", "955");
        msg.setMsg(r);
        return false;
    }
}
