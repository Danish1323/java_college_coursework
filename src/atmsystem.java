import java.util.Scanner;

public class atmsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 25000;

        System.out.println("===== ATM =====");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance Enquiry");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                // Check withdrawal amount
                if (amount <= 0) {
                    System.out.println("Invalid Amount");
                } else if (amount > balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    balance = balance - amount;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance: " + balance);
                }
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();

                // Check deposit amount
                if (deposit <= 0) {
                    System.out.println("Invalid Amount");
                } else {
                    balance = balance + deposit;
                    System.out.println("Deposit Successful");
                    System.out.println("New Balance: " + balance);
                }
                break;

            case 3:
                System.out.println("Current Balance: " + balance);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}