package Day1and2;

public class StaticVariable {
//static variables is variables declared at class level with static keyword there is no need to create object of the class
	
	public static String StuName = "Tony";
	String clg = "JNTU";
	public static int id = 55;
	
	public static void main(String[] args) {
		//access static variables 
		System.out.println(StuName);
		System.out.println(id);
		//access non static
		StaticVariable de = new StaticVariable();
		System.out.println(de.clg);
	}

}
