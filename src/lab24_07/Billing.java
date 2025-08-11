
package lab24_07;


abstract class Bill {
    // abstract method
    abstract void generateBill();
}


class ElectricityBill extends Bill {
    void generateBill() {
        System.out.println("Electricity Bill: 1645");
    }
}


class WaterBill extends Bill {
    void generateBill() {
        System.out.println("Water Bill: 500");
    }
}


public class Billing {
    public static void main(String[] args) {
        
        ElectricityBill obj = new ElectricityBill();
        obj.generateBill();
        WaterBill obj1 = new WaterBill();
        obj1.generateBill();
    }
}
