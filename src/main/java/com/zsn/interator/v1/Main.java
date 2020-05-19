package com.zsn.interator.v1;

/**
 * @Author: zsn
 * @Date: 2020/5/19 23:16
 */

/**
 * 构建一个容器，可以添加对象
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_ list_ = new ArrayList_();
        for (int i = 0; i < 13; i++) {
            list_.add(new String("s" + i));
        }
        System.out.println(list_.size());
    }
}

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ {
    Object[] objects = new Object[10];

    private int index = 0;

    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    public int size() {
        return index;
    }
}
