public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double toSavingsBalance) {
        savingsBalance = toSavingsBalance;
    }

    public static void modifyInterestRate(double toInterestRate) {
        annualInterestRate = toInterestRate;
    }

    public void printBalance() {
        System.out.println(savingsBalance);
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = (savingsBalance * (annualInterestRate / 12.0));
        savingsBalance = savingsBalance + monthlyInterest;
    }


}
