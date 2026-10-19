import java.util.Scanner;

class Student{
    private String name;
    private int age;

    public void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class encapsulation{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName();
        s1.setAge();

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}