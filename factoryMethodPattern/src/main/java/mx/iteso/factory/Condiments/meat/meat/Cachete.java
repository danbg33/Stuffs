package mx.iteso.factory.Condiments.meat.meat;

import mx.iteso.factory.Condiments.meat.Condiments;
import mx.iteso.factory.Pozole;

/**
 * Created by DaNN on 13/10/2015.
 */
public class Cachete extends Condiments{

    Pozole pozole;

    public Cachete (Pozole pozole)
    {

        this.pozole = pozole;
    }

    public String addTopping()
    {return "";

    }
}
