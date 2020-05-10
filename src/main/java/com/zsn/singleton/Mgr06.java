package com.zsn.singleton;

/**
 *  lazy loading
 *  懒汉式
 *  虽然达到了按需初始化的目的，（但却带来线程不安全的问题）
 *  可以通过synchronized 解决，但也到来效率下降
 *  感觉这种有点智障的写法，双重判断
 * @Author: zsn
 * @Date: 2020/5/4 14:36
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE ;//不加 volatile ， JIT 优化时 会出问题 （指令重排的问题 ）

    //    重点，不让别人用的构造
    private Mgr06() {
    }

//    synchronized 与static ，代表锁 Mgr04的对象
    public static Mgr06 getInstance() {
        if (INSTANCE ==null){
//            双重检查
            synchronized (Mgr06.class) {
                if (INSTANCE ==null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

//    这个是测试多线程 ，测试多线程访问时的影响
    public static void main(String[] args) {
        for (int i =0 ;i<100;i++){
            new Thread(()->{//只有一个方法时，可以间歇
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }


}
