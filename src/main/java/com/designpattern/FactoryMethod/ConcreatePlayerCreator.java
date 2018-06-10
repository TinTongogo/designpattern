package com.designpattern.FactoryMethod;

/**
 * 具体的制造工厂
 * <p>
 * Created by yaoyc on 2018/6/10.
 */
public class ConcreatePlayerCreator extends MusicPlayerCreator {

    @Override
    public <T extends MusicPlayer> T creatorMusicPlayer(Class<T> tClass) {
        MusicPlayer musicPlayer = null;
        try {
            musicPlayer = (MusicPlayer) Class.forName(tClass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) musicPlayer;
    }
}
