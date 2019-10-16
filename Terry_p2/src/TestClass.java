import java.util.Scanner;

public class TestClass {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int i;

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);


        System.out.println("Saver 1 and 2, 12 months at 4 percent --");

        for (i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.print("Saver 1 - Month " + (i+1) + ": ");
            saver1.printBalance();

            System.out.print("Saver 2 - Month " + (i+1) + ": ");
            saver2.printBalance();

            System.out.println("");

        }

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Saver 1 - 5 percent rate month: ");
        saver1.printBalance();

        System.out.print("Saver 2 - 5 percent rate month: ");
        saver2.printBalance();



    }
}
