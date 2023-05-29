package AbstractFactory.components.Menu;

public class IOSMenu implements Menu{
    @Override
    public void changeMenu() {
        System.out.println("changed menu in android");
    }
}
