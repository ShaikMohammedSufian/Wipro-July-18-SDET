package Day4Package1;

public class SamePackNonSubClass {
	public void write() {
		System.out.println("Writing in SamePackNonSubClass");
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		SamePackNonSubClass obj1 = new SamePackNonSubClass();
		obj.display();//inherited
		obj1.write();//own method
		//obj.fetch();//not getting because it is private
		obj.fetchEmpid();//default access
		obj.Empname();//protected
	}

}
