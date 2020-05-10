package com.zsn.strategy;

/**
 * @Author: zsn
 * @Date: 2020/5/4 19:13
 */
public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compareTo(Cat o1, Cat o2) {
        if (o1.age < o2.age) return -1;
        else if (o1.age > o2.age) return 1;
        else return 0;
    }
}
