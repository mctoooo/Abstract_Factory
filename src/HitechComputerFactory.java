public class HitechComputerFactory implements AbstractFactory {

    public void ComputerFactory()
    {

        System.out.println(toString());

    }

    public String toString() {
        return "(" + Hitechprocessor.getProcessor() + "," + HitechMonitor.getMonitor() + "," + HitechHdd.getHdd() +")";
    }
    }



}

