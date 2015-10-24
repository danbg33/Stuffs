package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.MangoMilkIceCream;
import main.Icecream.PineappleMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class PineappleMilkIceCreamTest {
    private IceCream Pinemilk;

    @Before
    public void setUp()
    {
        this.Pinemilk = new PineappleMilkIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Pinemilk.getBase(),"Milk");
        assertEquals(Pinemilk.getFlavor(),"Pineapple");
    }
}
