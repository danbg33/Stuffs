package mx.iteso.singleton;

/**
 * Created by DaNN on 29/10/2015.
 */
public abstract class ChocolateBoiler {
    public boolean empty;
    public boolean boiled;


    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fillthe boiler with a milk/chocolate mixture
        }
    }


    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

}
