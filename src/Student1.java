class Student1 {

    String name;
    int age;

    Student1() {
        name = "Rahul";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class constructor {

    public static void main(String[] args) {

        // student1 class ka object banaya hai
        Student1 s1 = new Student1();

        // display method call kiya hai
        s1.display();
    }
}