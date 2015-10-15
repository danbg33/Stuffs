package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class Menudo extends Pozole {
    public Menudo() {

        name = this.MENUDO;
        broth = this.BLANCO;

    }

    @Override
    public void serve() {
        System.out.println("Serving xtra hot in special menudo plate..." );
    }
}
