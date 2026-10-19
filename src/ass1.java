import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        // print my name and roll number
        System.out.println("Name: Danish");
        System.out.println("Roll No: 147");

        // scanner for input
        Scanner sc = new Scanner(System.in);

        // taking 2 numbers from user
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // doing calculations
        double sum = a + b;
        double diff = a - b;
        double prod = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);

        // check if second number is 0 before dividing
        if (b != 0) {
            double quot = a / b;
            double rem = a % b;
            System.out.println("Quotient = " + quot);
            System.out.println("Remainder = " + rem);
        } else {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}