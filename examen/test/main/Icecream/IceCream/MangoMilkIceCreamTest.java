package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.GuavaMilkIceCream;
import main.Icecream.MangoMilkIceCream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class MangoMilkIceCreamTest {

    private IceCream Mangomilk;

    @Before
    public void setUp()
    {
        this.Mangomilk = new MangoMilkIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Mangomilk.getBase(),"Milk");
        assertEquals(Mangomilk.getFlavor(),"Mango");
    }
}
