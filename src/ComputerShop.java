public class ComputerShop {
    AbstractFactory Tecnology;

    ComputerShop(AbstractFactory tec) {
        Tecnology = tec;
    }

    public void AssembleComputer() {
        String cpu = Tecnology.Create_Processor();
        String hdd = Tecnology.Create_Hdd();
        String monitor = Tecnology.Create_Monitor();

    }
}
