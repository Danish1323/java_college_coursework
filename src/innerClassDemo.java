import java.util.Scanner;

class BankAccount1{
    String name;
    double balance;

    void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your balance: ");
        balance = sc.nextDouble();
    }

    BankAccount1(){
        this.name = name;
        this.balance = balance;
    }

    class AccountDetails{
        void Display(){
            System.out.println("Account Holder: " + name);
            System.out.println("Balance: " + balance);
        }
    }
}

public class innerClassDemo{
    public static void main(String[] args){
        BankAccount1 acc = new BankAccount1();

        acc.setDetails();

        BankAccount1.AccountDetails details = acc.new AccountDetails();

        details.Display();
    }
}