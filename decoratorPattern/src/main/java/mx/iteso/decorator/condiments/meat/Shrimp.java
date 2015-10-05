package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by DaNN on 01/10/2015.
 */
public class Shrimp extends CondimentsDecorator{
    Taco taco;

    public Shrimp(Taco taco){
        this.taco = taco;
        boolean isMega = (this.size.equals(this.MEGA));

        if(isMega)
        {

            this.size = this.MEGA;
        }
        else if(!isMega){
            this.size = REGULAR;
        }
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de Shrimp";
    }

    @Override
    public double cost() throws Exception{
        return 0 + taco.cost();
    }
}
