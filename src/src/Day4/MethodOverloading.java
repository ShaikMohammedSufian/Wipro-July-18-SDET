package Day4;

public class MethodOverloading {
	//method add with 2 parameters
	//different no . of parameters
	
	public int add (int a, int b) {
		int c = a+b;
		return c;
		
	}
	
	//method add with 3 parameters
		public int add (int a, int b, int c) {
			int d = a+b+c;
			return d;
			
		}
	
		//method add with 4 parameters
				public int add (int a, int b, int c, int d) {
					int e = a+b+c+d;
					return e;
					
				}
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		//obj.add(2, 3);
		
		//obj.add(1, 2,3,4);
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(1, 2,3));
		System.out.println(obj.add(1, 2,3,4));
	}

}
