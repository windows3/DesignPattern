package com.zsn.singleton;

/**
 *  跟01一样
 *
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE ;

//    就是加了一个静态语句块
    static {
        INSTANCE=new Mgr02();
    }
    //    重点，不让别人用的构造
    private Mgr02() {
    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 mgr01 = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();

        System.out.println(mgr01==mgr02);
    }


}
