package com.designpattern.Singleton;

/**
 * 懒汉式加锁
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {
        System.out.println("生成对象Singleton2》》》》》》》》》》》");
    }

    public static Singleton2 getSingleton() {
        //同步块，线程安全的创建实例
        synchronized (Singleton2.class) {
            if (singleton == null) {
                try {
                    //线程暂停10毫秒,复现高并发下单例问题
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                singleton = new Singleton2();
            }
        }
        return singleton;
    }

    public void say() {
        System.out.println("Singleton1.say : hello Singleton2 !");
    }
}
