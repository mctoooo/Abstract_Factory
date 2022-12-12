public class HitechHdd implements AbstractHdd {
    private static String Hdd;

    public String Hdd() {
        HitechHdd.Hdd = ("Hi-techHdd_123");
        return Hdd;
    }

    public static String getHdd() {
        return HitechHdd.Hdd;
    }

}
