package main.stores;

import main.IceCream;
import main.IceCreamStore;
import main.Icecream.PineappleMilkIceCream;
import main.Icecream.GuavaMilkIceCream;
import main.Icecream.MangoMilkIceCream;
import main.Icecream.StrawberryMilkIceCream;

/**
 * Created by DaNN on 23/10/2015.
 */
public class MilkIceCreamStore extends IceCreamStore {

public IceCream createIceCream(String flavor)
{
    if(flavor.equals("Strawberry"))
    return new StrawberryMilkIceCream();

    else if(flavor.equals("Pineapple"))
    {
        return  new PineappleMilkIceCream();
    }
    else if (flavor.equals("Mango"))
    {
        return new MangoMilkIceCream();
    }

    else if (flavor.equals("Guava"))
    {
        return new GuavaMilkIceCream();
    }
    return null;

}


    public void prepareCone()
    {

    }
}
