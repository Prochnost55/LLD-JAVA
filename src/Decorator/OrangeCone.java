package Decorator;

public class OrangeCone extends BaseAddon {
    public OrangeCone(){};
    public OrangeCone(Icecream ic) {
        super(ic);
    }

    private int costOfAddon = 15;
    private String nameOfAddon = "Orange cone";

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