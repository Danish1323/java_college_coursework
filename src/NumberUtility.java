import java.util.Scanner;

public class NumberUtility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Name: Danish, Roll No: 147");

        do {
            System.out.println("1. Even or Odd");
            System.out.println("2. Prime Check");
            System.out.println("3. Power");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = sc.nextInt();
                    checkEvenOdd(num1);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    checkPrime(num2);
                    break;

                case 3:
                    System.out.print("Is base whole number or decimal? (w/d): ");
                    String type = sc.next();

                    System.out.print("Enter exponent: ");
                    int exp = sc.nextInt();

                    if (type.equalsIgnoreCase("w")) {
                        System.out.print("Enter base (int): ");
                        int base = sc.nextInt();

                        int result = power(base, exp);
                        System.out.println("Result: " + result);

                    } else {
                        System.out.print("Enter base (decimal): ");
                        double dbase = sc.nextDouble();

                        double result = power(dbase, exp);
                        System.out.println("Result: " + result);
                    }
                    break;

                case 4:
                    System.out.print("Enter a number for table: ");
                    int num4 = sc.nextInt();
                    printTable(num4);
                    break;

                case 5:
                    System.out.println("Program ended. Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
                    continue;
            }

        } while (choice != 5);

        sc.close();
    }

    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }

    static void checkPrime(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a Prime number.");
        }
    }

    static int power(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result = result * base;
        }

        return result;
    }

    static double power(double base, int exp) {
        double result = 1.0;

        for (int i = 0; i < exp; i++) {
            result = result * base;
        }

        return result;
    }

    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}