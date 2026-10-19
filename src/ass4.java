import java.util.Scanner;

public class ass4 {
  public static void main(String[] args) {
    // my details
    System.out.println("Name: Danish");
    System.out.println("Roll No: 147");

    Scanner sc = new Scanner(System.in);

    // take year input
    System.out.print("Enter year: ");
    int year = sc.nextInt();

    // leap year logic
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        // century year condition
        if (year % 400 == 0) {
          System.out.println(year + " is a leap year");
        } else {
          System.out.println(year + " is not a leap year");
        }
      } else {
        System.out.println(year + " is a leap year");
      }
    } else {
      System.out.println(year + " is not a leap year");
    }

    sc.close();
  }
}