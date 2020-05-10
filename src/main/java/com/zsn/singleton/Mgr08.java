package com.zsn.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化（Mgr07.class.newInstance();）
 * JAVA创始人推荐的写法，完美
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public enum Mgr08 {

    INSTANCE;

    //    这个是测试多线程 ，测试多线程访问时的影响
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {//只有一个方法时，可以简化
//                System.out.println(Mgr08.INSTANCE.hashCode());
//            }).start();
//        }
    }


}
