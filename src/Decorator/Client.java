package Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new ChocoScoop(
                new VanillaScoop(
                        new BlueBerryScoop(
                                new ChocolateCone(
                                        new ChocoSyrup(
                                                new OrangeCone()
                                        )
                                )
                        )
                )
        );

        System.out.println("Your order description => " + icecream.getDesc());
        System.out.println("Cost of ice-cream => " + icecream.getCost());

    }
}
