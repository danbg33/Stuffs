package mx.iteso.adapter.enemy.audioplayer.impl;

import mx.iteso.adapter.enemy.audioplayer.AdvancedMediaPlayer;

/**
 * Created by DaNN on 05/11/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public String playMp4() {
       return "I can´t play Mp4";
    }

    public String playVlc() {
        return "I am a VlcPlayer playing Vlc format. ";
    }
}
