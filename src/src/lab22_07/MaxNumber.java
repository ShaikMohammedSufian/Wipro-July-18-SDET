package lab22_07;

public class MaxNumber {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		int c=30;
		
		int max;
		if(a>=b) {
			if (a>=c) {
				max = a;
			}else {
				max =c;
			}
		}else {
			if (b>=c) {
				max=b;
			}else {
				max=c;
			}
		}
		System.out.println("max is: "+max);
	}

}
