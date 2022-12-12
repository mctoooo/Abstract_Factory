public class Hitechprocessor implements AbstractProcessor {
    private static String Processor;

    public String Processor() {
        this.Processor = ("Hi-techProcessor_8923");
        return Processor;
    }

    public static String getProcessor() {
        return Hitechprocessor.Processor;
    }
}
