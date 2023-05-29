package AbstractFactory;

import AbstractFactory.components.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.IOS);
        Button button = uiFactory.createButton();
        button.changeColor();
    }
}
