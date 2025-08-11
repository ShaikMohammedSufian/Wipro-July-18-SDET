package lab23_07;
//2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
//Super class
class vehicle{
	void drive() {
		System.out.println("Driving a car");
	}
}

//sub class 
class car extends vehicle{
	void drive() {
		System.out.println("repairing a car");
	}
}
public class RepairCar {

	public static void main(String[] args) {
		
		car c = new car();
		c.drive();
	}

}
