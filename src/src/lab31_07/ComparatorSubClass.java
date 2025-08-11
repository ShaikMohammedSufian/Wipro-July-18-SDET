package lab31_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Day10.ComparatorEmployee;
import Day10.Employee;

public class ComparatorSubClass implements Comparator<Employee1>{

	public int compare(Employee1 e1, Employee1 e2) {
		return e2.sal - e1.sal;
	}
	
	
	public static void main(String[] args) {

		List<Employee1> emp = new ArrayList<>();
		
		emp.add(new Employee1(50164,"Ash"));
		emp.add(new Employee1(10001,"Zara"));
		emp.add(new Employee1(12335,"John"));
		emp.add(new Employee1(5000,"Sara"));
		emp.add(new Employee1(68826,"Yeah"));
		
		Collections.sort(emp,new ComparatorSubClass());
		
		for(Employee1 e : emp) {
			System.out.println(e);
		}
	}

}
