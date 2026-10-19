import java.util.Scanner;

public class marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        if (marks>=75 && marks <= 100){
            System.out.println("Congrats distinction aagaya");
        } else if (marks < 75 && marks >= 60) {
            System.out.println("Thodi aur mehnat lagegi, ho jayega");
        } else if (marks < 60 && marks >= 45) {
            System.out.println("Bohot mehnat ki zarurat hai");
        }else if (marks < 45  && marks !=3) {
            System.out.println("WOOOOOWWWWW, you failed it successfully");
        }else if (marks == 3) {
            System.out.println("Arey sarthak bhai aap?");
        }else if (marks > 100) {
            System.out.println("Galat baat cheating nahi");
        } else{
            System.out.println("Asli marks batao sharmao mat");
        }
    }
}