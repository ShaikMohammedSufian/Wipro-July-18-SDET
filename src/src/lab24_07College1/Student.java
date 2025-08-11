package lab24_07College1;

public class Student {
	//private variable 
	private String Stuname = "ABC";
	private int Id = 123;
	private String Dept = "CSE";
	//private method
	private void info() {
		System.out.println("Name is "+Stuname);
		System.out.println("Id is "+ Id);
		System.out.println("Dept is "+ Dept);
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.info();
		
		
	}

}
