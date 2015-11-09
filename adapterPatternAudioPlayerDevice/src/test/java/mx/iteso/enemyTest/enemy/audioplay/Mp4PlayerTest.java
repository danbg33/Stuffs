package mx.iteso.enemyTest.enemy.audioplay;

import mx.iteso.adapter.enemy.audioplayer.impl.Mp4Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 05/11/2015.
 */
public class Mp4PlayerTest {

    Mp4Player mp4Player;
    @Before
    public void setUp()
    {
                mp4Player = new Mp4Player();
    }

    @Test
    public void playVlcTest()
    {
        assertEquals("I can´t play Vlc", mp4Player.playVlc());
    }

    @Test
    public void playMp4Test()
    {
        assertEquals("I am a Mp4Player playing Mp4 format. ", mp4Player.playMp4());
    }
}
