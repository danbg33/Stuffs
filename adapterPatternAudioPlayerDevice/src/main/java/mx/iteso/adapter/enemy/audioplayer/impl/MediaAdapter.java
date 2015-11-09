package mx.iteso.adapter.enemy.audioplayer.impl;

import mx.iteso.adapter.enemy.audioplayer.AdvancedMediaPlayer;
import mx.iteso.adapter.enemy.audioplayer.MediaPlayer;

/**
 * Created by DaNN on 05/11/2015.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advplay;

    public MediaAdapter(AdvancedMediaPlayer adl)
    {
        this.advplay = adl;
    }

    public MediaAdapter() {

    }

    public boolean play(String format)
    {
        if(advplay.equals("Vlc"))
        {
            advplay = new VlcPlayer();
            advplay.playVlc();
            advplay.playMp4();
            return true;
        }
        if(advplay.equals("Mp4"))
        {
            advplay = new Mp4Player();
            advplay.playMp4();
            advplay.playVlc();
            return true;
        }
        return false;
    }
}
