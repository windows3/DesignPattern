package com.zsn.Chain;

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

    public boolean doFilter(Msg msg) {
        for (MyFilter filter : filters) {
            if (!filter.doFilter(msg)) return false;


        }
        return true;
    }

}
