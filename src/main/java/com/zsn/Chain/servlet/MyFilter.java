package com.zsn.Chain.servlet;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:33
 */
public interface MyFilter {
    boolean doFilter(Request request, Response response,FilterChain filterChain);


}
