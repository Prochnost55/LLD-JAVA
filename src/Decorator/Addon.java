package Decorator;

public abstract class Addon implements Icecream{

    Icecream ic = null;
    private int costOfAddon;
    private String nameOfAddon;

    public Addon(Icecream ic){
        this.ic = ic;
    }
}
