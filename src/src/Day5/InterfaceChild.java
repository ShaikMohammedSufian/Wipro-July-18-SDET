package Day5;

public class InterfaceChild implements Interface1{

	
	
	public void display() {
		System.out.println("display in child class");
	}

	
	public void read() {
		System.out.println("reading in child class");
	}
	public static void main(String[] args) {
		
		InterfaceChild ic = new InterfaceChild();
		ic.display();
		ic.read();
		
		ic.show();//default method
		Interface1.write();//it is static
		System.out.println(empname);//coming from interface directly
		System.out.println(empid);// same as above
	}

	

}
