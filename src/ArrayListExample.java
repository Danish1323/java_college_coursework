import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        names.add("Danish");
//        names.add("Sarthak");
//        names.add("Omkar");
//        names.add("Jaikishan");

        System.out.print("How many names do you want to enter: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            System.out.print("Enter the name you want to enter: ");
            String name = sc.nextLine();

            names.add(name);
        }
        System.out.println(names);
    }
}