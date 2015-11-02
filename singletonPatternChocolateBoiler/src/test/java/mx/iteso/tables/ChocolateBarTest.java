package mx.iteso.tables;

/**
 * Created by DaNN on 01/11/2015.
 */
import mx.iteso.singleton.ChocolateBoiler;
import mx.iteso.singleton.tables.ChocolateBar;
import org.junit.*;

import static org.junit.Assert.*;
public class ChocolateBarTest {

    public ChocolateBoiler boiler;

    @Before
    public void setUp()
    {
        boiler = ChocolateBar.getChocolateBarInstance();
        boiler.empty= true;
        boiler.boiled =false;
    }

    @Test
    public void fillTest()
    {boiler.fill();
        assertEquals(false, boiler.isEmpty());
        assertEquals(false, boiler.isBoiled());
    }

    @Test
            public void drainTest()
    {
            boiler.empty = true;
        boiler.boiled = false;
        boiler.drain();
        assertEquals(true, boiler.isEmpty());

    }

    @Test
    public void boilTest()
    {
        boiler.empty = false;
        boiler.boiled = false;
        boiler.boil();
        assertEquals(true, boiler.isBoiled());
    }

    @Test
    public void isEmptyTest ()
    {
        assertEquals(true, boiler.isEmpty());
    }

    @Test
    public void isBoiled()
    {
        assertEquals(false, boiler.isBoiled());
    }


    public class Hilo implements Runnable{
        public void run() {
            boiler = ChocolateBar.getChocolateBarInstance();
            if (boiler.isEmpty()) {
                boiler.fill();
            } else if (!boiler.isBoiled()) {
                boiler.boil();
            } else if (boiler.isBoiled()) {
                boiler.drain();
            }
        }

    }
    @Test
    public void HilosTest()
    {
        Hilo hilo1 = new Hilo();
        Hilo hilo2 =  new Hilo();
        Hilo hilo3 = new Hilo();

        hilo1.run();
        hilo2.run();
        hilo3.run();

        assertEquals(true,boiler.isEmpty());

    }

}
