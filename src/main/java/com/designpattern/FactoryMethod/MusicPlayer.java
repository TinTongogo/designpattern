package com.designpattern.FactoryMethod;

/**
 * 播放器
 * <p>
 * Created by yaoyc on 2018/6/10.
 */
public abstract class MusicPlayer {

    /**
     * 播放音乐,音乐播放器公共方法
     */
    public void play() {
        System.out.println("MusicPlayer开始播放音乐了");
    }

    /**
     * 每种播放器暂停方法不一样
     */
    public abstract void pause();
}
