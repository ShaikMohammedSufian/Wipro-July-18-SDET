package Day5;

public interface Interface1 {

	//abstract method
	abstract void display();
	void read();//by default it is abstract in nature even if you not give abstract keyword
	
	//static cannot be override in subclasses
	static void write () {
		System.out.println("write");
	}
	
	default void show() {
		System.out.println("showing");
	}
	String empname="ssss";//default it takes public,static,final in interface
	
	int empid = 55;//same as above
	
	//no constructor is allowed
	// cannot create object for interfaces in ain body so i dint write public static void main method
	
	
}
