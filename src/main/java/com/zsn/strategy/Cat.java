package com.zsn.strategy;

/**
 * @Author: zsn
 * @Date: 2020/5/4 17:56
 */
public class Cat implements Comparable<Cat>{
    int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat c) {
        if (this.age < c.age) return -1;
        else if (this.age > c.age) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
