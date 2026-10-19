import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        // printing details
        System.out.println("Name: Danish");
        System.out.println("Roll No: 147");

        Scanner sc = new Scanner(System.in);

        // input 3 numbers
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();

        int largest;

        // nested if to find largest
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // print result
        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}