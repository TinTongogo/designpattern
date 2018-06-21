package com.designpattern.factorymethod;

import org.junit.Test;

/**
 * Created by yaoyc on 2018/6/10.
 */
public class FactoryMethodTest {
    @Test
    public void test(){
        MusicPlayerCreator musicPlayerCreator = new ConcreatePlayerCreator();
        //我想要一个MP3，给我造一个
        Mp3Player mp3Player = musicPlayerCreator.creatorMusicPlayer(Mp3Player.class);
        //MP3播放音乐
        mp3Player.play();
        //MP3暂停播放音乐
        mp3Player.pause();
        //我想要一个MP3，给我造一个
        Mp4Player mp4Player = musicPlayerCreator.creatorMusicPlayer(Mp4Player.class);
        //MP4播放音乐
        mp4Player.play();
        //MP4暂停播放音乐
        mp4Player.pause();
    }
}
