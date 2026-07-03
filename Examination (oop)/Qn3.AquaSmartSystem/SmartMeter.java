public class SmartMeter {

    private String meterId;
    private double creditBalance;
    private boolean valveOpen;

    public SmartMeter(String meterId, double creditBalance) {
        this.meterId = meterId;
        this.creditBalance = creditBalance;
        this.valveOpen = true;
    }

    public double loadToken(double amount) {
        creditBalance += amount;

        if (!valveOpen) {
            valveOpen = true;
        }

        return creditBalance;
    }

    public boolean recordConsumption(double litres) {

        double cost = litres * 50;

        if (creditBalance >= cost) {
            creditBalance -= cost;

            if (creditBalance <= 0) {
                creditBalance = 0;
                valveOpen = false;
            }

            return true;
        } else {
            valveOpen = false;
            return false;
        }
    }

    public void showInfo() {
        System.out.println("Meter ID: " + meterId);
        System.out.println("Credit: " + creditBalance);
        System.out.println("Valve Open: " + valveOpen);
    }
}