public class OldtechComputerFactory implements AbstractFactory {
    @Override
    public String Create_Processor() {
        return new Oldtechprocessor();
    }
    @Override
    public String Create_Hdd(){ return new OldtechHdd(); }
    @Override
    public String Create_Monitor(){ return new OldtechMonitor(); }

}