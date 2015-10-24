package main.stores;

import main.IceCream;
import main.IceCreamStore;
import main.Icecream.PineappleWaterIceCream;
import main.Icecream.StrawberryWaterIceCream;
import main.Icecream.GuavaWaterIceCream;
import main.Icecream.MangoWaterIceScream;

/**
 * Created by DaNN on 23/10/2015.
 */
public class WaterIceCreamStore extends IceCreamStore {

    public IceCream createIceCream(String flavor)
    {
        if(flavor.equals("Strawberry")) {
            return new StrawberryWaterIceCream();
        }

        else if(flavor.equals("Pineapple"))

        {
            return  new PineappleWaterIceCream();
        }
        else if (flavor.equals("Mango"))
        {
            return new MangoWaterIceScream();
        }

        else if (flavor.equals("Guava"))
        {
            return new GuavaWaterIceCream();
        }
        return null;
    }



    public void prepareCone()
    {

    }

}
