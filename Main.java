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
