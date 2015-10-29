package mx.iteso;

/**
 * Created by DaNN on 28/10/2015.
 */

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DishTest {
    Dish dish;

    @Before
    public void SetUp()
    {
        dish = new Dish();
        dish.setDescription("Very spicy and juicy");
        dish.setName("Roast Beef");
        dish.setPrice(30f);
        dish.setWaiter("Waiter A");
    }

    @Test
    public void DishTest()
    {
        assertEquals("Very spicy and juicy", dish.getDescription());
        assertEquals("Roast Beef", dish.getName());
        assertEquals(30f,dish.getPrice(),30f);
        assertEquals("Waiter A", dish.getWaiter());



    }


}
