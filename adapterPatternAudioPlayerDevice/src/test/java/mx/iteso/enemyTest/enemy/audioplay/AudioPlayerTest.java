package mx.iteso.enemyTest.enemy.audioplay;

import mx.iteso.adapter.enemy.audioplayer.impl.AudioPlayer;
import mx.iteso.adapter.enemy.audioplayer.impl.MediaAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 05/11/2015.
 */
public class AudioPlayerTest {
    public AudioPlayer audip;
    @Before
    public void setUp()
    {
        audip = new AudioPlayer();
    }

    @Test
    public void playTest()
    {
        assertEquals(true, audip.play("Mp4"));
        assertEquals(true, audip.play("Vlc"));
    }
}
