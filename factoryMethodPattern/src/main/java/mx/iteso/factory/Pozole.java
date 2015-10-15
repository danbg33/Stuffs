package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;

    public String description ="Orden de";

    public String POZOLE ="Pozole";
    public String MENUDO = "Menudo";
    public String POZOLILLO = "PozolilloCachete";

    public String VERDE ="Verde";
    public String ROJO = "Rojo";
    public String BLANCO = "Blanco";

    public ArrayList toppings = new ArrayList();


    public void serve() {
        System.out.println("Serving in regular pozole plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding broth..." );
        System.out.println("Adding toppings:" );
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }

    }

    public String getDescription(){
        return description;
    }
}