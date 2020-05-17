package com.zsn.Chain.servlet;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:33
 */
public class HTMLFilter implements MyFilter {

    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        request.setPath1("HTMLFilter");

        return false;
    }
}
