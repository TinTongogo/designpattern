package com.designpattern.FactoryMethod;

/**
 * MP4播放器
 * <p>
 * Created by yaoyc on 2018/6/10.
 */
public class Mp3Player extends MusicPlayer {


    /**
     * mp3播放方法，Mp3Player也可以重写父类方法，实现自己的播放方法。
     * 重写方法的规则：
     * 1）、参数列表必须完全与被重写的方法相同，否则不能称其为重写而是重载。
     * 2）、返回的类型必须一直与被重写的方法的返回类型相同，否则不能称其为重写而是重载。
     * 3）、访问修饰符的限制一定要大于被重写方法的访问修饰符（public>protected>default>private）
     * 4）、重写方法一定不能抛出新的检查异常或者比被重写方法申明更加宽泛的检查型异常，大家可以想一下为什么。
     */
    @Override
    public void play() {
        System.out.println("mp3开始播放音乐");
    }


    /**
     * mp3暂停方法
     */
    @Override
    public void pause() {
        System.out.println("mp3播放暂停了");
    }
}
