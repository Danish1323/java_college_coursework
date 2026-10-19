import java.util.Scanner;

public class ass3 {
    public static void main(String[] args) {
        // student details
        System.out.println("Name: Danish");
        System.out.println("Roll No: 147");

        Scanner sc = new Scanner(System.in);

        // get number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // check if remainder is 0 when divided by 2
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }

        sc.close();
    }
}