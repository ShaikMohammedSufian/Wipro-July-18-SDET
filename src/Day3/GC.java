package Day3;

public class GC {
	
	public void finalize() {
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		GC obj = new GC();
		//by nulling the reference
		obj=null;
		//by assigning a reference to another object
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj1 = obj2;
		
		
		//object out of scope
		GC obj3 = new GC();
		
		System.gc();
	}

}
