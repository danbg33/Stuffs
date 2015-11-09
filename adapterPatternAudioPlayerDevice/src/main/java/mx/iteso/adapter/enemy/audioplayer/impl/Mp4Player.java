package mx.iteso.adapter.enemy.audioplayer.impl;

import mx.iteso.adapter.enemy.audioplayer.AdvancedMediaPlayer;

/**
 * Created by DaNN on 05/11/2015.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public String playMp4() {
        return "I am a Mp4Player playing Mp4 format. ";

    }

    public String playVlc() {
        return "I can´t play Vlc";
    }
}
