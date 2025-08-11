package Day4Package1;

public class Class1 {
	
	//private variable
	private static String Salary = "123456";
	//private method
	private void fetch(){
		System.out.println("Salary is "+Salary);
	}
	//public method
	public void display() {
		System.out.println("Displaying");
	}
	//default variable
	int empid = 1654;
	//default method
	void fetchEmpid() {
		System.out.println("Emp id "+empid);
	}
	//protected variable 
	protected static String name = "ABC";
	//protected method
	protected void Empname() {
		System.out.println("Emp name is "+name);
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.display();//public access
		obj.fetch();//private access
		obj.fetchEmpid();//default access
		obj.Empname();//protected
	}

}
