public class OldtechComputerFactory implements AbstractFactory{
    public void ComputerFactory()
    {

       System.out.println(toString());

    }

    public String toString() {
        return "(" + Oldtechprocessor.getProcessor() + "," + OldtechMonitor.getMonitor() + "," + OldtechHdd.getHdd() +")";
    }
}
