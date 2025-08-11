package lab22_07;

public class Primenumber {
	public static int checkPrime(int n) {
		if (n<=1)
			return -1;
		for (int i =2;i<n;i++) {
			if (n%2==0)return -1;
		}
		return n;
	}
	public static void main(String[] args) {
		int number =11;
		int result = checkPrime(number);
		System.out.println(result);
	}

}
