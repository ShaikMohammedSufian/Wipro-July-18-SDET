package Day4Package1;

public class SamePackSubClass extends Class1{
	public void read() {
		System.out.println("reading in Same Package SubClass");
	}
	public static void main(String[] args) {
		SamePackSubClass obj = new SamePackSubClass();
		obj.display();
		obj.read();
		//obj.fetch();//not getting because it is private in class1
		obj.fetchEmpid();//default access
		obj.Empname();//protected
	}

}
