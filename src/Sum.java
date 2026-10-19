import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.println("num1 + num2 = " + (num1+num2));
        System.out.println("num1 - num2 = " + (num1-num2));
        System.out.println("num1 / num2 = " + (num1/num2));
        System.out.println("num1 * num2 = " + (num1*num2));
    }
}