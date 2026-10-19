import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class UD_Excep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }

            System.out.println("Valid marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        sc.close();
    }
}