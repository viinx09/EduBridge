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
        System.out.println("Car Brand: " + this.brand);
        System.out.println("Parent Brand: " + super.brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "BMW");
        c.display();
    }
}
