package lab31_07;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 5678;
		
		int r=0;
		
		for (; num>0;num=num/10) {
			int n = num%10;
			r =r*10+n;
		}

	System.out.println("reverse : "+ r);
		
	}

}
