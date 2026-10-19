import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try{
            FileOutputStream fos = new FileOutputStream("student.txt");
            String data = "Student Name: " + name + "\n" +
                    "Course: " + course + "\n" +
                    "Marks: " + marks;

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Student Data saved successfully.");
        }catch(IOException e){
            System.out.println("Error while saving data");
        }

        sc.close();
    }
}