package Decorator;

public class ChocoSyrup extends Addon {
    public ChocoSyrup(Icecream ic) {
        super(ic);
    }

    private int costOfAddon = 20;
    private String nameOfAddon = "Choco Syrup";

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