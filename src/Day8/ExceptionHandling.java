package Day8;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			//code where  the application logic is there
			int a =100;
			int b =0;
			int c =a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			//print the traceof exception
			System.out.println(e);
		}
	}

}
