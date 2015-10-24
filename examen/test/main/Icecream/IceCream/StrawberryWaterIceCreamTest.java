package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.StrawberryWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class StrawberryWaterIceCreamTest {
    private IceCream Strawwater;

    @Before
    public void setUp()
    {
        this.Strawwater = new StrawberryWaterIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Strawwater.getBase(),"Water");
        assertEquals(Strawwater.getFlavor(),"Strawberry");
    }
}
