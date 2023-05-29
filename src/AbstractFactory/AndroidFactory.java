package AbstractFactory;

import AbstractFactory.components.Button.AndroidButton;
import AbstractFactory.components.Button.Button;
import AbstractFactory.components.Menu.AndroidMenu;
import AbstractFactory.components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        System.out.println("create android button");
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        System.out.println("create android menu");
        return new AndroidMenu();
    }
}
