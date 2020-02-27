package com.designpattern.singleton;

/**
 * 类级内部类实现单例
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton6 {
    private Singleton6(){
        System.out.println("生成对象Singleton6》》》》》》》》》》》");
    }
    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton6 singleton = new Singleton6();
    }

    public static Singleton6 getSingleton(){
        return SingletonHolder.singleton;
    }

    public void say(){
        System.out.println("Singleton6.say : hello Singleton6 !");
    }
}
