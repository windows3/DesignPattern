package com.zsn.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVN保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 * 话说 你不用，你装载他干啥
 *
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    //    重点，不让别人用的构造
    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 =Mgr01.getInstance();
        Mgr01 mgr02 =Mgr01.getInstance();

        System.out.println(mgr01==mgr02);
    }


}
