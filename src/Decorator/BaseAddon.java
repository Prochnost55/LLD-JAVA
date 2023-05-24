package Decorator;

public abstract class BaseAddon implements Icecream{

    Icecream ic = null;
    private int costOfAddon;
    private String nameOfAddon;

    public BaseAddon(Icecream ic){
        this.ic = ic;
    }
    public BaseAddon(){};
}
