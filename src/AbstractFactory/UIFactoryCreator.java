package AbstractFactory;

public class UIFactoryCreator {
    public static UIFactory createFactory(SupportedPlatforms platform) {
        if (platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidFactory();
        } else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IOSFactory();
        }
        return null;
    }
}
