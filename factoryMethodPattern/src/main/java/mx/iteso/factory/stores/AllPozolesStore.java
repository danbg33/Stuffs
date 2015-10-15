package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by DaNN on 08/10/2015.
 */
public class AllPozolesStore{

    PozoleStore verdePozole;
    PozoleStore rojoPozole;
    PozoleStore menudo;
    PozoleStore blancoPozole;
    PozoleStore pozolillo;


    public AllPozolesStore()
    {
    }
    public Pozole createPozole(String type,String meat) {
        Pozole pozole = null;


        if (type.equals("Rojo")) {

            rojoPozole =new PozoleRojoStore();
            pozole = rojoPozole.orderPozole(meat);
        }

        else if(type.equals("Blanco"))
        {
            blancoPozole = new PozoleBlancoStore();
            pozole = blancoPozole.orderPozole(meat);

        }

        else if(type.equals("Verde"))
        {
            verdePozole = new PozoleVerdeStore();
            pozole = verdePozole.orderPozole(meat);
        }

        else if (type.equals("Pozilillo"))
        {
            pozolillo = new PozolilloStore();
            pozole = pozolillo.orderPozole(meat);
        }
        else if(type.equals("Menudo"))
        {
           menudo = new MenudoStore();
            pozole = menudo.orderPozole(meat);
        }



        return pozole;
    }

}
