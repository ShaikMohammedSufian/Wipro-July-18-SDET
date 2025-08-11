package lab22_07;

public class Factorial {

	public static void main(String[] args) {
		int n = 4;
		int fact=1;
		
		if (n<=0) {
			System.out.println("Not be defined for negative number");
		}else {
			for (int i =1;i<=n;i++) {
				fact*=i;
				
			}
			System.out.println(fact);
		}
	}

}
