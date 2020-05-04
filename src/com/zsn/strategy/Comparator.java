package com.zsn.strategy;

/**
 * 策略 模拟java的 comparator
 *
 * @Author: zsn
 * @Date: 2020/5/4 19:08
 */
public interface Comparator<T> {
    int compareTo(T o1, T o2);
}
