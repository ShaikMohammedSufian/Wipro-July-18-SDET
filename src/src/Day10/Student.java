package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	
	int roll;
	String name;
	
	//constructor of class to pass the parameters
	public Student(int roll, String name) {
		
		this.name=name;
		this.roll=roll;
		
	}
	
	//implement compare to for natural ordering (by roll number)
	

	public int compareTo(Student s) {
		
		return this.roll - s.roll;
	}
	
	public String toString() {
		return roll +"_ "+ name;
	}
	
	
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(103,"Abhay"));
		students.add(new Student(101,"Ashu"));
		students.add(new Student(104,"Raj"));
		students.add(new Student(102,"Kamal"));
		
		
		Collections.sort(students);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
	}

	

}
