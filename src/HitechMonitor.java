public class HitechMonitor implements AbstractMonitor {
    private static String monitor;

    public String Monitor() {
        HitechMonitor.monitor = ("Hi-techMonitor_123");
        return monitor;
    }

    public static String getMonitor() {
        return HitechMonitor.monitor;
    }
}
