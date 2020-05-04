package com.zsn.strategy;

/**
 * @Author: zsn
 * @Date: 2020/5/4 17:56
 */
public class Dog implements Comparable<Dog> {
    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog d) {
        if (this.food < d.food) return -1;
        else if (this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
