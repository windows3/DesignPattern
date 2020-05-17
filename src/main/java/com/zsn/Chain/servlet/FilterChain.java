package com.zsn.Chain.servlet;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zsn
 * @Date: 2020/5/10 23:40
 */
public class FilterChain implements MyFilter {
    List<MyFilter> filters = new ArrayList<MyFilter>();

    public FilterChain add(MyFilter f) {
        filters.add(f);

        return this;
    }

    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        for (MyFilter filter : filters) {
            if (!filter.doFilter(request,response, filterChain)) return false;


        }
        return true;
    }

}
