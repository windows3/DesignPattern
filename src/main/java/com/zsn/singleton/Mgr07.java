package com.zsn.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * 完美
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public class Mgr07 {

    //    重点，不让别人用的构造
    private Mgr07() {
    }
//  静态内部类 在Mgr07被加载时，不会被加载；只有调到getInstance 才会加载
    private static class Mgr07Holder {
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    //    这个是测试多线程 ，测试多线程访问时的影响
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {//只有一个方法时，可以简化
//                System.out.println(Mgr07.getInstance().hashCode());
//            }).start();
//        }
    }


}
