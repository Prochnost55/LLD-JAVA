package Decorator;

public class ChocoScoop extends Addon {
    public ChocoScoop(Icecream ic) {
        super(ic);
    }

    private int costOfAddon = 20;
    private String nameOfAddon = "Choco Scoop";

    @Override
    public int getCost() {
        if(this.ic == null){
            return costOfAddon;
        }
        return this.ic.getCost() + costOfAddon;
    }

    @Override
    public String getDesc() {
        if(this.ic == null){
            return nameOfAddon;
        }
        return this.ic.getDesc() + ", " + nameOfAddon;
    }
}