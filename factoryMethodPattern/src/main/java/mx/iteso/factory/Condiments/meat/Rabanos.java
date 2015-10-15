package mx.iteso.factory.Condiments.meat;

import mx.iteso.factory.Pozole;

/**
 * Created by DaNN on 13/10/2015.
 */
public class Rabanos extends Condiments{

    Pozole pozole;
    public Rabanos(Pozole pozole)
    {
        this.pozole = pozole;

    }

    @Override
    public String addTopping() {
        return "";
    }
}
