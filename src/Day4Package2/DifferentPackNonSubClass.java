package Day4Package2;
import Day4Package1.Class1;
public class DifferentPackNonSubClass {
	
	public void print() {
		System.out.println("Printing in ");
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		DifferentPackNonSubClass obj1 = new DifferentPackNonSubClass();
		obj.display();
		obj1.print();
		//obj.fetch();//not getting because it is private in class 1
		
		//obj.fetchEmpid();//default access in package 1 is not accessable outside package 1
		//obj.Empname();//protected not accessble to non subclass
	}

}
