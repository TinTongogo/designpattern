package com.designpattern.FactoryMethod;

/**
 * 抽象工厂
 * <p>
 * Created by yaoyc on 2018/6/10.
 */
public abstract class MusicPlayerCreator {
    /**
     * 创造一个播放器，输入类型可以自行设置
     * 通常是String、Enum、Class等，当然也可以为空
     *
     * @param tClass
     * @param <T>
     * @return
     */
    public abstract <T extends MusicPlayer> T creatorMusicPlayer(Class<T> tClass);
}
