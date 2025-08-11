package Day3;

public class SingleInChildClass extends SingleInSuperClass{
	String model = "Mustang";
	
	public void display() {
		System.out.println("Brand "+brand);
		System.out.println("Model "+model);
	}
	public static void main(String[] args) {
		
		SingleInChildClass obj = new SingleInChildClass();
		
		obj.start();
		obj.display();
		
	}

}
