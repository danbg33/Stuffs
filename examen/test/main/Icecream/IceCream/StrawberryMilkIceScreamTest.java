package main.Icecream.IceCream;

import main.IceCream;
import main.Icecream.PineappleMilkIceCream;
import main.Icecream.StrawberryMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by DaNN on 23/10/2015.
 */
public class StrawberryMilkIceScreamTest {
    private IceCream Strawmilk;

    @Before
    public void setUp()
    {
        this.Strawmilk = new StrawberryMilkIceCream();
    }

    @Test
    public void GuavaWaterIceCreamTest() {
        assertEquals(Strawmilk.getBase(),"Milk");
        assertEquals(Strawmilk.getFlavor(),"Strawberry");
    }
}
