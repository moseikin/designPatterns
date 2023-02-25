public class DecoratorMain {

    public static void main(String[] args) {
        StandardCar standardCar = new StandardCar();
        System.out.println(standardCar);

        CustomCar customCar = new CustomCar(standardCar, 10, 100);
        System.out.println(customCar);

        CustomCar customCarWithAttrs = new CustomCar(standardCar, 25, 300,
                new MachineGun(), new ChainSaw(), new Nitro());
        System.out.println(customCarWithAttrs);
    }
}
