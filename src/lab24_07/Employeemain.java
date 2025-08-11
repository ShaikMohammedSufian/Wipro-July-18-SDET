package lab24_07;

// Abstract class
abstract class Employee {
    String name;
    int id;

    // Abstract method
    abstract void calcSalary();

    // Normal method
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    // Static variable
    public static String company = "ABC";
    
    // private final String Type = "HR";
}

// Subclass
class PermanentEmployee extends Employee {
    void calcSalary() {
        System.out.println("Salary of permanent employee is 6000000");
    }
}

// Subclass
class ContractEmployee extends Employee {
    void calcSalary() {
        System.out.println("Salary of contract employee is 25000");
    }
}

// Main class
public class Employeemain {
    public static void main(String[] args) {
        PermanentEmployee obj = new PermanentEmployee();
        obj.name = "sam";
        obj.id = 55;
        obj.showDetails();
        obj.calcSalary();
        System.out.println(Employee.company);
    }
}
