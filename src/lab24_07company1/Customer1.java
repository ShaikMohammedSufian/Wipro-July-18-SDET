package lab24_07company1;

public class Customer1 {
	protected String Name = "pqrs";
	protected int id = 55;
	protected String Dept = "IT";
	
	//protecd methos
	
	protected void Customerdetails() {
		System.out.println(Name);
		System.out.println("customer id "+ id);
		System.out.println(Dept);
	}
	public static void main(String[] args) {
		Customer1 obj = new Customer1();
		obj.Customerdetails();
	}

}
