package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by DaNN on 01/10/2015.
 */
public class Volcanes  extends Taco{
    public Volcanes(String s){

        if(!s.equals(this.REGULAR))
        {
        this.size = this.REGULAR;}
        else
        {
            this.size = this.REGULAR;
        }
        description = "Volcan"+size;
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
