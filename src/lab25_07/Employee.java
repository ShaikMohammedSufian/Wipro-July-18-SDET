package lab25_07;
/*Employee Salary Validation
Create a Employee class with private fields: name, id, salary
Salary must be positive — implement validation inside the setter
Add a method to displayDetails() showing all info
Create multiple employee objects and test with different salary values.*/
public class Employee {
	//private
	
	private String name;
	private int id;
	private double salary;
	
	//setter
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	
	public void setsalary(double salary) {
		if(salary>0) {
		this.salary=salary;
		}else{
			System.out.println("invalid salary");
		}
	}
	//getter
	
	public String getname() {
		return name;
		
	}
	
	public int getid() {
		return id;
	}
	
	public double getsalary() {
		return salary;
	}
	
	//details
	
	public void display() {
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("salary "+salary);
	}
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		obj1.setname("john");
		obj1.setid(556);
		obj1.setsalary(67254);
		obj1.display();
		
		
		Employee obj2 = new Employee();
		obj2.setname("wick");
		obj2.setid(655);
		obj2.setsalary(65441383);
		obj2.display();
		
		
		
		
	}

}
