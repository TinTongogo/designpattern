package com.designpattern.singleton;

/**
 * 双重检查加锁
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton3 {
    private static Singleton3 singleton = null;

    private Singleton3() {
        System.out.println("生成对象Singleton3》》》》》》》》》》》");
    }

    public static Singleton3 getSingleton() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(singleton == null) {
            try {
                //线程暂停10毫秒,复现高并发下单例问题
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步块，线程安全的创建实例
            synchronized (Singleton3.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (singleton == null) {
                    try {
                        //线程暂停10毫秒,复现高并发下单例问题
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

    public void say() {
        System.out.println("Singleton3.say : hello Singleton3 !");
    }
}
