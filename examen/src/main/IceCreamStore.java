package main;

/**
 * Created by DaNN on 23/10/2015.
 */
public abstract class IceCreamStore {

    public IceCream orderIceCream(String flavor)
    {
        IceCream icecream;

        icecream = createIceCream(flavor);

        icecream.prepareCone();

        return icecream;
    }


    protected abstract IceCream createIceCream(String flavor);
}
