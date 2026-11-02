#Employee
class Employee {
    int employeeId;
    String name;
    double basicSalary;
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    double calculateSalary() {
        return basicSalary;
    }
    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class PermanentEmployee extends Employee {
    double allowance;
    double bonus;
    PermanentEmployee(int id, String name, double salary, double allowance, double bonus) {super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;
    ContractEmployee(int id, String name, double salary, int hoursWorked, double hourlyRate) {super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee(101, "Rahul", 30000, 5000, 3000);
        ContractEmployee c1 = new ContractEmployee(102, "Priya", 0, 160, 200);
        Employee[] employees = {p1, c1};
        for (Employee e : employees) {
            System.out.println("\n----------------------");
            e.display();
            System.out.println("Calculated Salary: " + e.calculateSalary());
        }
    }
}

-------------------------------------------------------------------------------------------------------------------------------
#Vehicle
class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}
class Car extends Vehicle {
    String brand;
    Car(String parentBrand, String childBrand) {
        super(parentBrand);
        this.brand = childBrand; 
    }
    @Override
    void display() {
        super.display();
        System.out.println("Car Brand: " + brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "BMW");
        c.display();
    }
}

------------------------------------------------------------------------------------------------------------------------------------
#Persion_Inhereantce
class Person {
    String name;
    int age;
    Person(String name, int age) {
        System.out.println("Person Constructor Called");
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    int employeeId;
    double basicSalary;

    Employee(String name, int age, int employeeId, double basicSalary) {
        super(name, age);
        System.out.println("Employee Constructor Called");
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class Manager extends Employee {
    String department;
    double bonus;
    Manager(String name, int age, int employeeId, double basicSalary, String department, double bonus) {
        super(name, age, employeeId, basicSalary);
        System.out.println("Manager Constructor Called");
        this.department = department;
        this.bonus = bonus;
    }
    double calculateTotalSalary() {
        return basicSalary + bonus;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " +
                calculateTotalSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Viond", 35, 101, 50000, "IT", 10000);
        System.out.println("\n--- Manager Details ---");
        m.display();
    }
}
---------------------------------------------------------------------------------------------------------------------------------
#SHAPE AND AREA 
class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 4);
        shapes[2] = new Triangle(6, 8);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].area();
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------
#Payment
class Payment {
    double calculateAmount(double amount) {
        return amount;
    }
    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}
class CardPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.02; // 2% fee
        return amount + fee;
    }
}
class UPIPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.01; // 1% fee
        return amount + fee;
    }
}
public class Main {
    public static void main(String[] args) {
        Payment p;
        p = new CardPayment();
        System.out.println("Card Payment: " + p.calculateAmount(1000));
        p = new UPIPayment();
        System.out.println("UPI Payment: " + p.calculateAmount(1000));
        System.out.println("Amount after discount: " + p.calculateAmount(1000, 10));
    }
}  
------------------------------------------------------------------------------------------------------------------------------------------------
    #Persion_AND_Student
    class Person {
    private String name;
    private int age;
    private static int count = 0;
    public static final String COLLEGE_NAME = "Cambridge Insitiute Of Technology North Campus";
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        System.out.println("Person Constructor Called");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static int getCount() {
        return count;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void displayDetails(String message) {
        System.out.println(message);
        displayDetails();
    }
    static class Department {
        private String departmentName;
        Department(String departmentName) {
            this.departmentName = departmentName;
        }
        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}
class Student extends Person {
    private int rollNo;
    private String course;
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
        System.out.println("Student Constructor Called");
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        super.displayDetails();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Faculty extends Person {
    private int facultyId;
    private String subject;
    Faculty(String name, int age,
            int facultyId, String subject) {

        super(name, age);

        this.facultyId = facultyId;
        this.subject = subject;

        System.out.println("Faculty Constructor Called");
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        super.displayDetails();
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}
class Administrator extends Person {
    private int adminId;
    private String role;
    Administrator(String name, int age, int adminId, String role) {
        super(name, age);
        this.adminId = adminId;
        this.role = role;
        System.out.println("Administrator Constructor Called"
        );
    }
    @Override
    public void displayDetails() {
        System.out.println("\n--- Administrator Details ---");
        super.displayDetails();
        System.out.println("Admin ID: " + adminId);
        System.out.println("Role: " + role);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("College: " + Person.COLLEGE_NAME);
        Student s = new Student("Vinod", 20, 73, "Computer Science");
        Faculty f = new Faculty("Thejas", 35, 68, "Java Programming");
        Administrator a = new Administrator("Arun", 40, 301, "Principal");
        Person[] people = new Person[3];
        people[0] = s;
        people[1] = f;
        people[2] = a;
        System.out.println("\n=== College Details ===");
        for (int i = 0; i < people.length; i++) {
            people[i].displayDetails();
        }
        System.out.println("\n=== Overloaded Method ===");
        s.displayDetails("Student Information");
        Person.Department d = new Person.Department("Information Technology");
        System.out.println("\n=== Department Details ===");
        d.displayDepartment();
        System.out.println("\nTotal People Created: " + Person.getCount());
    }
}
