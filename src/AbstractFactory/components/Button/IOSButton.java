package AbstractFactory.components.Button;

public class IOSButton implements Button{

    @Override
    public void changeSize() {
        System.out.println("changed the size in ios button");
    }

    @Override
    public void changeColor() {
        System.out.println("changed the color in ios button");
    }
}
