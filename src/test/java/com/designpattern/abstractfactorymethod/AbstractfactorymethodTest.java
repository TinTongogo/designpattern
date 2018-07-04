package com.designpattern.abstractfactorymethod;

import org.junit.Test;

/**
 * 抽象工厂测试
 * Created by yaoyc on 2018/7/4.
 */
public class AbstractfactorymethodTest {
    @Test
    public void test() {
        //定义两个工厂
        AbstarctMusicPlayerFactory greenMusicPlayerCreator = new GreenMusicPlayerFactory();
        AbstarctMusicPlayerFactory redMusicPlayerCreator = new RedMusicPlayerFactory();
        //生产绿色MP3
        AbstarctMp3MusicPlayer greenMusicPlayerCreatorMp3MusicPlayer = greenMusicPlayerCreator.createMp3MusicPlayer();
        //生产绿色MP4
        AbstarctMp4MusicPlayer greenMusicPlayerCreatorMp4MusicPlayer = greenMusicPlayerCreator.createMp4MusicPlayer();
        //生产绿色MP3
        AbstarctMp3MusicPlayer redMusicPlayerCreatorMp3MusicPlayer = redMusicPlayerCreator.createMp3MusicPlayer();
        //生产红色MP4
        AbstarctMp4MusicPlayer redMusicPlayerCreatorMp4MusicPlayer = redMusicPlayerCreator.createMp4MusicPlayer();

        greenMusicPlayerCreatorMp3MusicPlayer.getColor();
        greenMusicPlayerCreatorMp3MusicPlayer.play();
        greenMusicPlayerCreatorMp4MusicPlayer.getColor();
        greenMusicPlayerCreatorMp4MusicPlayer.play();
        redMusicPlayerCreatorMp3MusicPlayer.getColor();
        redMusicPlayerCreatorMp3MusicPlayer.play();
        redMusicPlayerCreatorMp4MusicPlayer.getColor();
        redMusicPlayerCreatorMp4MusicPlayer.play();
    }
}
