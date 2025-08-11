
package lab24_07;

abstract class Vehicle {
    // abstract method
    abstract void move();
}


class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving on four wheels");
    }
}


class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving on two wheels");
    }
}


class Bus extends Vehicle {
    void move() {
        System.out.println("Bus is moving on six wheels");
    }
}


public class VehicleMain {
    public static void main(String[] args) {
        
        Car obj = new Car();
        obj.move();
        Bike obj1 = new Bike();
        obj1.move();
        Bus obj2 = new Bus();
        obj2.move();
    }
}
