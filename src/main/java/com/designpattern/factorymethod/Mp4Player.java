package com.designpattern.factorymethod;

/**
 * MP4播放器
 * <p>
 * Created by yaoyc on 2018/6/10.
 */
public class Mp4Player extends MusicPlayer {

    /**
     * mp4暂停方法
     */
    @Override
    public void pause() {
        System.out.println("mp4播放暂停了");
    }
}
