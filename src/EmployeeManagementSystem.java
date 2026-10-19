import java.util.Scanner;

// abstract base class - cant make object of Employee directly
abstract class Employee {
    String name;
    int employeeId;

    // constructor
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // abstract methods, every child must define these
    abstract double calculateSalary();
    abstract String getEmployeeType();

    // common method for all employees
    void showDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + name + " | Type: " + getEmployeeType() + " | Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {

    double basicSalary;
    double bonus;

    // constructor
    FullTimeEmployee(String name, int employeeId, double basicSalary, double bonus) {
        super(name, employeeId);

        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    String getEmployeeType() {
        return "Full Time Employee";
    }
}

class PartTimeEmployee extends Employee {

    int workingHours;
    double hourlyRate;

    // constructor
    PartTimeEmployee(String name, int employeeId, int workingHours, double hourlyRate) {
        super(name, employeeId);

        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    String getEmployeeType() {
        return "Part Time Employee";
    }
}

class Intern extends Employee {
    double stipend;

    // constructor
    Intern(String name, int employeeId, double stipend) {
        super(name, employeeId);

        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }

    @Override
    String getEmployeeType() {
        return "Intern";
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100]; // fixed size array
        int count = 0; // tracks total employees added
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= employees.length) {
                        System.out.println("List is full!");
                        break;
                    }

                    sc.nextLine(); // clear buffer
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.println("Type: 1.Full Time  2.Part Time  3.Intern");
                    System.out.print("Choose type: ");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Basic Salary: ");
                        double basic = sc.nextDouble();
                        System.out.print("Bonus: ");
                        double bonus = sc.nextDouble();
                        employees[count] = new FullTimeEmployee(name, id, basic, bonus);
                        count++;
                    } else if (type == 2) {
                        System.out.print("Working Hours: ");
                        int hours = sc.nextInt();
                        System.out.print("Hourly Rate: ");
                        double rate = sc.nextDouble();
                        employees[count] = new PartTimeEmployee(name, id, hours, rate);
                        count++;
                    } else if (type == 3) {
                        System.out.print("Stipend: ");
                        double stipend = sc.nextDouble();
                        employees[count] = new Intern(name, id, stipend);
                        count++;
                    } else {
                        System.out.println("Invalid type!");
                        break;
                    }

                    System.out.println("Employee added!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employees[i].showDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... bye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}