public class Main {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount("SA001", 1000, 5);

        System.out.println("===== SAVINGS ACCOUNT =====");
        System.out.println(savings.generateStatement());

        System.out.println();

        System.out.println("Withdraw 300");
        System.out.println("Success: " + savings.withdraw(300));

        savings.addInterest();

        System.out.println(savings.generateStatement());

        System.out.println();

        CurrentAccount current =
                new CurrentAccount("CA001", 500, 1000);

        System.out.println("===== CURRENT ACCOUNT =====");
        System.out.println(current.generateStatement());

        System.out.println();

        System.out.println("Withdraw 1200");
        System.out.println("Success: " + current.withdraw(1200));

        System.out.println(current.generateStatement());
    }
}
