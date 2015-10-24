package main;

import main.stores.MilkIceCreamStore;

/**
 * Created by DaNN on 23/10/2015.
 */
public class IcecreamMain {

    public static void main(String args[])
    {
        IceCream icemango = new MilkIceCreamStore().orderIceCream("Mango");
        System.out.println("Tu eladin de "+ icemango.getBase()+  icemango.getFlavor()+ "Esta listo");


    }
}
