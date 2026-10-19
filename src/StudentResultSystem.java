import java.util.Scanner;

public class StudentResultSystem {

    public static void main(String[] args) {

        // scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        char choice;

        // do while loop so it runs atleast once, then asks if user wants to add another student
        do {
            System.out.println("--------------------------------------");

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            // if roll number is 0 we stop everything right here using break
            if (roll == 0) {
                System.out.println("Roll number 0 entered, stopping.");
                break;
            }

            System.out.println();
            System.out.println("Name: " + name + ", Roll No: " + roll);

            double total = 0;
            double highest = 0;
            double lowest = 100;

            // loop to take marks for 5 subjects one by one
            // highest and lowest are updated here itself, not using any array
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter marks for Subject " + i + ": ");
                double marks = sc.nextDouble();

                if (marks > highest) {
                    highest = marks;
                }
                if (marks < lowest) {
                    lowest = marks;
                }

                total = total + marks;
            }

            System.out.println();
            System.out.println("Highest subject mark: " + highest);
            System.out.println("Lowest subject mark: " + lowest);

            // calling the method that returns percentage
            double percentage = calculatePercentage(total, 5);
            System.out.printf("Percentage: %.2f%n", percentage);

            // switch statement to decide grade based on percentage/10
            char grade;
            int band = (int) (percentage / 10);

            switch (band) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                case 7:
                    grade = 'B';
                    break;
                case 6:
                    grade = 'C';
                    break;
                case 5:
                case 4:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }

            System.out.println("Grade: " + grade);

            // if else to check pass or fail
            if (percentage >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

            // calling the detailed displayResult if percentage is above 75, otherwise simple one
            // this is method overloading
            System.out.println();
            if (percentage > 75) {
                displayResult(name, percentage, grade, "Very Good performance.");
            } else {
                displayResult(name, percentage, grade);
            }

            System.out.println();
            sc.nextLine();
            System.out.print("Do you want to enter another student? (Y/N): ");
            choice = sc.nextLine().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }

    // method to calculate percentage, takes total marks and number of subjects
    public static double calculatePercentage(double total, int numSubjects) {
        return total / numSubjects;
    }

    // simple version of displayResult, used when percentage is 75 or below
    public static void displayResult(String name, double percentage, char grade) {
        System.out.printf("%s scored %.2f%% with grade %c%n", name, percentage, grade);
    }

    // overloaded version with remarks, used when percentage is above 75
    public static void displayResult(String name, double percentage, char grade, String remarks) {
        System.out.printf("%s scored %.2f%% with grade %c. Remarks: %s%n", name, percentage, grade, remarks);
    }
}