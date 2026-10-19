package Student;

public class student {

    String name;
    int age;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}