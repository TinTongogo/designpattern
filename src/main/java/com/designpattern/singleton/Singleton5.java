package com.designpattern.singleton;

/**
 * 枚举实现单例
 *
 * @author YYC
 * @date 2018/6/7
 */
public enum Singleton5 {
    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */

    singleton;

    /**
     * 单例可以有自己的操作
     */
    public void say(){
        System.out.println("Singleton1.say : hello Singleton5 !");
    }
}
