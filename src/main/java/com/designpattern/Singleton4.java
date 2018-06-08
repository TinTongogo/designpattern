package com.designpattern;

/**
 * 饿汉式
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton4 {
    private static Singleton4 singleton = new Singleton4();

    private Singleton4() {
        System.out.println("生成对象Singleton4》》》》》》》》》》》");
    }

    public static Singleton4 getSingleton() {
        try {
            //线程暂停10毫秒,复现高并发下单例问题
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

    public void say() {
        System.out.println("Singleton1.say : hello Singleton4 !");
    }
}
