package AbstractFactory;

import AbstractFactory.components.Button.Button;
import AbstractFactory.components.Button.IOSButton;
import AbstractFactory.components.Menu.IOSMenu;
import AbstractFactory.components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        System.out.println("create ios button");
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("create ios menu");
        return new IOSMenu();
    }
}
