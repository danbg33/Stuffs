package mx.iteso.factory.Condiments.meat.meat;

import mx.iteso.factory.Condiments.meat.Condiments;
import mx.iteso.factory.Pozole;

/**
 * Created by DaNN on 13/10/2015.
 */
public class Trompa extends Condiments{
    Pozole pozole;
    public Trompa(Pozole pozole)
    {
        this.pozole = pozole;

    }

    @Override
    public String addTopping() {
        return "";
    }
}
