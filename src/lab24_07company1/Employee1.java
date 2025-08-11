package lab24_07company1;

public class Employee1 {
	//public variable
	public String empname="xyz";
	public int empid=22;
	public String Dept = "Technician";
	//public method
	public void Details() {
		System.out.println("Emp name is "+empname);
		System.out.println("Emp id is "+empid);
		System.out.println("Emp dept is "+Dept);
	}
	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		obj.Details();
	}

}
