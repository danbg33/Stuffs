package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.PineappleWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class PineappleWaterIceCreamTest {

   private IceCream Pinewater;

    @Before
    public void setUp()
    {
        this.Pinewater = new PineappleWaterIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Pinewater.getBase(),"Water");
        assertEquals(Pinewater.getFlavor(),"Pineapple");
    }
}
