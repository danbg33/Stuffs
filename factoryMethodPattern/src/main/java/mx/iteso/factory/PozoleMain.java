package mx.iteso.factory;

import mx.iteso.factory.Condiments.meat.Cebolla;
import mx.iteso.factory.Condiments.meat.Oregano;
import mx.iteso.factory.stores.AllPozolesStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;

public class PozoleMain {
    public static void main (String[] args) {

        AllPozolesStore pozolero = new AllPozolesStore();
        Pozole pozole1=  pozolero.createPozole("Rojo","Pollo");

        pozole1 = new Cebolla(pozole1);
        pozole1 = new Oregano(pozole1);


     System.out.println(pozole1.getDescription());

    }
}