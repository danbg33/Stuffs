package mx.iteso.tables;

/**
 * Created by DaNN on 28/10/2015.
 */
import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class Table2Test {
    TableOrder order;

    @Before
    public void SetUpInstance()
    {
        order = Table2.getInstance();

    }

    @Test
    public void Table1NameTest()
    {
        assertEquals("Table2", order.tableName);
    }

    @Test
    public void Table1DrinkTest()
    {
        order.addDrink(new Drink());
        order.addDrink(new Drink());

        assertEquals(2, order.drinks.size());
        order.clearDrinks();
        assertEquals(0,order.drinks.size());
    }

    @Test
    public void Table1DishTest()
    {   order.addDish(new Dish());
        order.addDish(new Dish());
        assertEquals(2, order.dishes.size());
        order.clearDrinks();
        assertEquals(0,order.dishes.size());
    }


}
