package Day1and2;

public class ParametrizedMethod {
	//normal method with hard coded values
	
	public void add() {
		int a= 7;
		int b =6;
		int c = a + b;
		
		System.out.println(c);
		
	}
	
	//methods with parameters
	
	public void sum (int a , int b) {
		int c = a+b;
		
		System.out.println(c);
	}
	//return 
	
	public int add2( int a ,int b) {
		int c =a+b;
		return c;

	}
	public static void main(String[] args) {
		ParametrizedMethod a = new ParametrizedMethod();
		
		a.sum(2, 10);
		a.sum(10, -5);
		a.sum(100, 9);
		a.add();
		a.add2(200, 500);
		
	}
	

}
