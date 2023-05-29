package AbstractFactory.components.Button;

public class AndroidButton implements Button{

    @Override
    public void changeSize() {
        System.out.println("changed the size in android button");
    }

    @Override
    public void changeColor() {
        System.out.println("changed the color in android button");
    }
}
