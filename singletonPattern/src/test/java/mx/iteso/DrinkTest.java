package mx.iteso;

/**
 * Created by DaNN on 28/10/2015.
 */

import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
public class DrinkTest {

    Drink drink;

    @Before
    public void SetUp()
    {
        drink = new Drink();

        drink.setDescription("Water from Fiji");
        drink.setName("Fiji Water");
        drink.setPrice(10f);
        drink.setWaiter("Waiter A");
    }


    @Test
    public void DrinkTest()
    {
        assertEquals("Water from Fiji", drink.getDescription());
        assertEquals("Fiji Water", drink.getName());
        assertEquals((10f),drink.getPrice());
        assertEquals("Waiter A", drink.getWaiter());
    }
}
