package mx.iteso.singleton.tables;

import mx.iteso.singleton.ChocolateBoiler;

/**
 * Created by DaNN on 29/10/2015.
 */
public class ChocolateBar extends ChocolateBoiler{
    private static volatile ChocolateBoiler chocolateBar = null;

    private ChocolateBar() {
    this.boiled = false;
        this.empty= true;

    }

    public ChocolateBoiler getInstance() {

        if( chocolateBar == null){

            synchronized(this) {

                if (chocolateBar == null) {
                    chocolateBar = new ChocolateBar();
                }

            }

        }
        return chocolateBar;
    }


    public static synchronized ChocolateBoiler getChocolateBarInstance()
    {   if(chocolateBar ==null)
        {
            chocolateBar = new ChocolateBar();
        }
        return chocolateBar;
    }

    public static void clearInstance()
    {
        chocolateBar = null;
    }

}
