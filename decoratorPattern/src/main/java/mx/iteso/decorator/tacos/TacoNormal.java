package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size)
    {   this.size = size;
        description = "Taco normal" + size;


    }


    TacoNormal(){}



    @Override
    public double cost() throws Exception{

        if(this.size.equals(this.MINI))
        {
        return 8.00;
        }

        if(this.size.equals(this.MEGA))
        {
            return 12.00;
        }
        else { return 10.00;
         }
    }
}
