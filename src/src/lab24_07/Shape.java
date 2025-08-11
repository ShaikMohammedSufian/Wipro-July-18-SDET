package lab24_07;

// Abstract class
abstract class shapes {
    // Abstract method
    abstract void Area();

    // Normal method
    public void display() {
        System.out.println("Shape");
    }
}

// Subclass
class Circle extends shapes {
    // Override 
    void Area() {
        System.out.println("Area of circle 9");
    }
}

// Subclass
class Rectangle extends shapes {
    // Override 
    void Area() {
        System.out.println("Area of rectangle 6");
    }
}


public class Shape {
    public static void main(String[] args) {
        // Circle object
        Circle c = new Circle();
        c.display();
        c.Area();

        // Rectangle object
        Rectangle r = new Rectangle();
        r.display();
        r.Area();
    }
}
