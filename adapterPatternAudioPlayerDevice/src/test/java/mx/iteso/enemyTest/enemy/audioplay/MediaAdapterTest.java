package mx.iteso.enemyTest.enemy.audioplay;

import mx.iteso.adapter.enemy.audioplayer.impl.MediaAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 05/11/2015.
 */
public class MediaAdapterTest {

    public MediaAdapter mediap;
    @Before
    public void setUp()
    {
        mediap = new MediaAdapter();
    }

    @Test
    public void playTest()
    {
        assertEquals(true,mediap.play("Mp4"));
        assertEquals(true,mediap.play("Vlc"));
        assertEquals(false,mediap.play("Jpg"));
    }
}
