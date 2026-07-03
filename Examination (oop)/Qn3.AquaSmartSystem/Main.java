public class Main {

    public static void main(String[] args) {

        SmartMeter meter = new SmartMeter("KIS-001", 100);

        meter.showInfo();

        System.out.println("\n--- Using water ---");
        meter.recordConsumption(1); // 50 UGX
        meter.recordConsumption(2); // 100 UGX

        meter.showInfo();

        System.out.println("\n--- Loading token ---");
        meter.loadToken(200);

        meter.showInfo();

        System.out.println("\n--- Heavy usage ---");
        meter.recordConsumption(10); // may close valve

        meter.showInfo();
    }
}