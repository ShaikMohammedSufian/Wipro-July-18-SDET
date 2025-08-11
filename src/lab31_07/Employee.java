package lab31_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Employee implements Comparable <Employee>{

	int roll;
	String name;
	
	//constructor of class to pass the parameters
	public Employee(int roll, String name) {
		
		this.name=name;
		this.roll=roll;
		
	}
	
	//implement compare to for natural ordering (by alphabetical order)
	

	public int compareTo(Employee s) {
		//return this.roll - s.roll;
		return this.name.compareTo(s.name);
	}
	
	public String toString() {
		return name +"_ "+ roll;
	}
	
	
	
	public static void main(String[] args) {
		
		List<Employee> e = new ArrayList<>();
		
		e.add(new Employee(103,"Vinay"));
		e.add(new Employee(101,"Ashu"));
		e.add(new Employee(104,"Raj"));
		e.add(new Employee(102,"Kamal"));
		e.add(new Employee(105,"John"));
		
		//System.out.println(e);
		
		Collections.sort(e);
		
		for(Employee s : e) {
			System.out.println(s);
		}
		
	}

	
}
