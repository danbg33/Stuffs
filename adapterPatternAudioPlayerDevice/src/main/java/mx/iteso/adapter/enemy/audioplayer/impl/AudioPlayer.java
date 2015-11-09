package mx.iteso.adapter.enemy.audioplayer.impl;

import mx.iteso.adapter.enemy.audioplayer.MediaPlayer;

/**
 * Created by DaNN on 05/11/2015.
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mAdapt;
    public AudioPlayer()
    {
        mAdapt = new MediaAdapter();

    }
    public boolean play(String format)
    {
        mAdapt.play(format);
        return true;
    }
}
