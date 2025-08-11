package lab22_07;

public class SumNaturalNum {

	public static void main(String[] args) {
		int a=5;
		int sum=0;
		int i =1;
		
		while (i<=a) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of first "+a+" natural numbers is "+ sum);
	}

}
