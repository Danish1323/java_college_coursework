class Student2{
    String name;
    int age;

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class paramconstruct{
    public static void main(String[] args){
        Student2 s1 = new Student2("Rahul", 20);
        Student2 s2 = new Student2("Danish", 21);

        s1.display();
        s2.display();
    }
}