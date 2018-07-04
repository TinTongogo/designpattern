package com.designpattern.abstractfactorymethod;

/**
 * 音乐播放器工厂接口
 * Created by yaoyc on 2018/7/4.
 */
public abstract class AbstarctMusicPlayerFactory {

    /**
     * 制造一个MP3
     * @return
     */
    public abstract AbstarctMp3MusicPlayer createMp3MusicPlayer();
    /**
     * 制造一个MP4
     * @return
     */
    public abstract AbstarctMp4MusicPlayer createMp4MusicPlayer();
}
