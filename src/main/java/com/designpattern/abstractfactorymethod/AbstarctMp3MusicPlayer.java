package com.designpattern.abstractfactorymethod;

/**
 * 抽象MP3
 * Created by yaoyc on 2018/7/4.
 */
public abstract class AbstarctMp3MusicPlayer {

    /**
     * MP3播放
     */
    public void play() {
        System.out.println("MP3播放音乐！");
    }

    /**
     * 播放器颜色
     */
    public abstract void getColor();
}
