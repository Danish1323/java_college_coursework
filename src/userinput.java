import java.util.Scanner;

public class userinput{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
//        Scanner ac = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the city that you live in: ");
//        Scanner cc = new Scanner(System.in);
        String city = sc.nextLine();
        System.out.println("Welcome " + name + " looks like you are " + age + " years old!, and live in " + city);
        sc.close();
    }
}