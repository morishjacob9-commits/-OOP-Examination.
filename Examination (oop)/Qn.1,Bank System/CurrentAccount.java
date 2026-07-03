public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNo, double opening, double overdraftLimit) {
        super(accountNo, opening);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {

        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        }

        return false;
    }
}
