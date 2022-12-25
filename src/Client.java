public class Client {
    public static void main(String[] args) {

        AbstractFactory factory = new HitechComputerFactory();
        ComputerShop shop = new ComputerShop(factory);
        shop.AssembleComputer();

        factory = new OldtechComputerFactory();
        shop = new ComputerShop(factory);
        shop.AssembleComputer();
    }

}