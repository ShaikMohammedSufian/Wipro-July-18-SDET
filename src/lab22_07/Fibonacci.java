package lab22_07;


public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10;
		
		int a=0,b=1;
		System.out.println(n);
		for (int i =1;i<n;i++) {
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
