package main;

/**
 * Created by DaNN on 23/10/2015.
 */
public abstract class IceCream {

    public String  base =" ";
    public String flavor = "";

    public void prepareCone()
    {
        System.out.println("Preparing IceCream of" + flavor );
        System.out.println("\tChoosing the perfect cone..."+ base);
        System.out.println("\tAdding ice cream ball..."+flavor);
    }

    public String getBase()
    {
    return base;
    }

    public String getFlavor()
    {return flavor;

    }

}
