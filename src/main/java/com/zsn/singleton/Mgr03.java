package com.zsn.singleton;

/**
 *  lazy loading
 *  懒汉式
 *  虽然达到了按需初始化的目的，（但却带来线程不安全的问题）
 *  多线程访问时有影响
 *
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public class Mgr03 {
    private static  Mgr03 INSTANCE ;

    //    重点，不让别人用的构造
    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE ==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr03();
        }
        return INSTANCE;
    }

//    这个是测试多线程 ，测试多线程访问时的影响
    public static void main(String[] args) {
//        for (int i =0 ;i<100;i++){
//            new Thread(()->{//只有一个方法时，可以间歇
//                System.out.println(Mgr03.getInstance().hashCode());
//            }).start();
//        }
    }


}
