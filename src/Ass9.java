import java.util.Scanner;

enum Course{
    JAVA,
    PYTHON,
    MACHINE_LEARNING,
    DATA_SCIENCE
};

final class CollegeRules{
    static final int PASS_MARKS = 40;

    static void showRules(){
        System.out.println("Minimum Passing Marks: " + PASS_MARKS);
    }
}

class Students{
    private String name;
    private int marks;
    private Course course;

    Students(String name, int marks, Course course){
        this.name = name;
        this.marks = marks;
        this.course = course;

    }

    final void showBasicDetials(){
        System.out.println("\nStudent Details");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
    }
    class result{
        void showResult(){
            if (marks >= CollegeRules.PASS_MARKS){
                System.out.println("Result: Pass");
            }else{
                System.out.println("Result: Fail");
            }
        }
    }
}

interface Message{
    void send();
}

public class Ass9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Management System");
        System.out.println("--------------------------");

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("\nChoose Course");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. Machine learning");
        System.out.println("4. Data Science");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        Course course = null;

        if(choice == 1){
            course = Course.JAVA;
        } else if (choice == 2) {
            course = Course.PYTHON;
        } else if (choice == 3) {
            course = Course.MACHINE_LEARNING;
        } else if (choice == 4) {
            course = Course.DATA_SCIENCE;
        } else{
            System.out.println("Sahi option select kar na yaaaaaarrrr");
            return;
        }

        Students s1 = new Students(name, marks, course);
        s1.showBasicDetials();

        Students.result res = s1.new result();

        res.showResult();

        CollegeRules.showRules();

        Message mess = new Message() {
            @Override
            public void send() {
                System.out.println("Message: Student record save ho gaya");
            }
        };

        mess.send();

        sc.close();
    }
}