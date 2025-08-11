package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEmployee implements Comparator<Employee> {

	
	
	 public int compare(Employee e1, Employee e2) {
		 return e1.name.compareTo(e2.name);
	 }
	

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(103,"Ash"));
		emp.add(new Employee(101,"Zara"));
		emp.add(new Employee(102,"John"));
		emp.add(new Employee(105,"Sara"));
		emp.add(new Employee(103,"Yeah"));
		
		Collections.sort(emp,new ComparatorEmployee());
		for(Employee e : emp) {
			System.out.println(e);
		}
		
	}

}
