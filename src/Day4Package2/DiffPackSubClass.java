package Day4Package2;
import Day4Package1.Class1;
public class DiffPackSubClass extends Class1{
	public void create() {
		System.out.println("create in ");
	}
	public static void main(String[] args) {
		DiffPackSubClass obj = new DiffPackSubClass();
		obj.create();
		obj.display();//public access //inherited
		//obj.fetch();//not getting because it is private in class1
		//obj.fetchEmpid();//default access in package 1 is not accessable outside package 1
		obj.Empname();//protected

	}

}
