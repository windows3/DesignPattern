package com.zsn.Chain;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:33
 */
public class HTMLFilter implements MyFilter {

    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<", "[");
        r = r.replace(">", "]");
        msg.setMsg(r);
        return true;
    }
}
