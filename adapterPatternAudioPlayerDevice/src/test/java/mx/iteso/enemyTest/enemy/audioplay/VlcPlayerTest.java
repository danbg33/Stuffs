package mx.iteso.enemyTest.enemy.audioplay;

import mx.iteso.adapter.enemy.audioplayer.impl.VlcPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 05/11/2015.
 */
public class VlcPlayerTest {

    VlcPlayer vl;
    @Before
    public void setUp()
    {
        vl = new VlcPlayer();
    }

    @Test
    public void playVlcTest()
    {
        assertEquals("I am a VlcPlayer playing Vlc format. " ,vl.playVlc());
    }

    @Test
    public void playMp4Test()
    {
        assertEquals("I can´t play Mp4",vl.playMp4());
    }
}
