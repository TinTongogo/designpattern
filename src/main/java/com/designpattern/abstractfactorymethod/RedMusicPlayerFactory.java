package com.designpattern.abstractfactorymethod;

/**
 * 绿色播放器工厂
 * Created by yaoyc on 2018/7/4.
 */
public class RedMusicPlayerFactory extends AbstarctMusicPlayerFactory {


    @Override
    public AbstarctMp3MusicPlayer createMp3MusicPlayer() {
        return new RedMp3MusicPlayer();
    }

    @Override
    public AbstarctMp4MusicPlayer createMp4MusicPlayer() {
        return new RedMp4MusicPlayer();
    }
}
