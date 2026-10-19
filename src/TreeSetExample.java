import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetExample{
    public static void main(String[] args){
        TreeSet<String> names = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many cities do you want to enter: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            System.out.print("Enter the City you want to enter: ");
            String name = sc.nextLine();

            names.add(name);
        }
        System.out.println(names);
    }
}