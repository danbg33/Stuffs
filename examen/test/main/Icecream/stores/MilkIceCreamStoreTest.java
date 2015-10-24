package main.Icecream.stores;

import main.stores.MilkIceCreamStore;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by DaNN on 23/10/2015.
 */
public class MilkIceCreamStoreTest {
    private MilkIceCreamStore mklstore ;


    @Before
    public void setUp()
    {
        this.mklstore = new MilkIceCreamStore();

    }

    @Test
    public void MilkIceCreamStoreTest()
    {
        when(mklstore.createIceCream("Strawberry")).thenReturn("Strawberry");
    }

}
