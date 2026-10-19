import java.util.Scanner;

class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class bankencaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        account.setBalance(balance);

        System.out.println("Balance: " + account.getBalance());

        sc.close();
    }
}