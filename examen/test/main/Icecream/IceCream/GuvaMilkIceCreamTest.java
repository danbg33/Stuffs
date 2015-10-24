package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.GuavaMilkIceCream;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by DaNN on 23/10/2015.
 */
public class GuvaMilkIceCreamTest {

    private  IceCream Guavamilk;

    @Before
    public void setUp()
    {
        this.Guavamilk = new GuavaMilkIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest()
    {
        assertEquals(Guavamilk.getBase(),"Milk");
        assertEquals(Guavamilk.getFlavor(),"Guava");
    }

}
