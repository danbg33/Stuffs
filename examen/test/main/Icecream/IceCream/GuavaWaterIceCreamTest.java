package main.Icecream.IceCream;

import main.IceCream;
import static org.junit.Assert.assertEquals;
import main.Icecream.GuavaWaterIceCream;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by DaNN on 23/10/2015.
 */
public class GuavaWaterIceCreamTest {

    private IceCream Guavawater;

    @Before
    public void setUp()
    {
        this.Guavawater = new GuavaWaterIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest()
    {
        assertEquals(Guavawater.getBase(),"Water");
        assertEquals(Guavawater.getFlavor(),"Guava");
    }

}
