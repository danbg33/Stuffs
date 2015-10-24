package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.MangoWaterIceScream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class MangoWaterIceCreamTest {
    private IceCream Mangowater;

    @Before
    public void setUp()
    {
        this.Mangowater = new MangoWaterIceScream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Mangowater.getBase(),"Water");
        assertEquals(Mangowater.getFlavor(),"Mango");
    }
}
