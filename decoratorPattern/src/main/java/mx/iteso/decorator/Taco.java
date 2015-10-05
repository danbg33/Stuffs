package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";

    public final String MEGA ="Mega";
    public final String MINI = "Mini";
    public final String REGULAR = "Regular";

    public String size = "Regular";

    public String getDescription(){
        return description;
    }
    public String getSize()
    {
        return size;
    }
    public void setSize(String s)
    {
        this.size = s;
    }
    public abstract double cost() throws  Exception;
}
