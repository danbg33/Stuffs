package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String s)
    {   this.size= s;
        description = "Quesadilla" + size;

    }

    @Override
    public double cost() {

        return 10.00;
    }
}
