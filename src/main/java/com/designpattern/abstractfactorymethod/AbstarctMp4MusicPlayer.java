package com.designpattern.abstractfactorymethod;

/**
 * 抽象MP4
 * Created by yaoyc on 2018/7/4.
 */
public abstract class AbstarctMp4MusicPlayer{

    /**
     * MP4播放
     */
    public void play() {
        System.out.println("MP4播放视频！");
    }

    /**
     * 播放器颜色
     */
    public abstract void getColor();
}
