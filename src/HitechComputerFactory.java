public class HitechComputerFactory implements AbstractFactory {
    @Override
    public String Create_Processor() { return new Hitechprocessor(); }

    @Override
    public String Create_Hdd() { return new HitechHdd(); }

    @Override
    public String Create_Monitor() { return new HitechMonitor(); }

}

