package mx.iteso.factory.Condiments.meat;

import mx.iteso.factory.Pozole;

/**
 * Created by DaNN on 13/10/2015.
 */
public class Cebolla extends Condiments{

    Pozole pozole;
    public Cebolla(Pozole pozole)
    {
        this.pozole = pozole;

    }

    @Override
    public String addTopping() {
        return pozole.getDescription() +"con cebolla";
    }
}
