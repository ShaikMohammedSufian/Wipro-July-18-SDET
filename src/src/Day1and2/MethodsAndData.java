package Day1and2;

public class MethodsAndData {
	//employee data
			//instance variable or class level variable
			public String employeeName = "Tony";
			int empid = 22;
			public static String empBU ="Dev";
			
			public void fetchdetails() {
				System.out.println(employeeName);
				System.out.println(empid);
				System.out.println(empBU);
				//local variables
				
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAndData md = new MethodsAndData();
		md.fetchdetails();	
	}

}
