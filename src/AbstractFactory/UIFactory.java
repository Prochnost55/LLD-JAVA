package AbstractFactory;

import AbstractFactory.components.Button.Button;
import AbstractFactory.components.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
