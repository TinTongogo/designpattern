package com.designpattern;

/**
 * 懒汉式
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton1 {
    private static Singleton1 singleton = null;
    private Singleton1(){
        System.out.println("生成对象Singleton1》》》》》》》》》》》");
    }

    public static Singleton1 getSingleton() {
        if (singleton == null) {
            try {
                //线程暂停10毫秒,复现高并发下单例问题
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new Singleton1();
        }
        return singleton;
    }

    public void say(){
        System.out.println("Singleton1.say : hello Singleton1 !");
    }
}
