package lab31_07;

public class Employee1 {

	int sal;
	String name;
	
	
	
	Employee1(int sal,String name){
		this.sal=sal;
		this.name=name;
	}
	
	
	public String toString() {
		return sal+" - "+ name;
	}
}
