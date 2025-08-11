package lab22_07;

public class EvenTest {
	public static boolean Even(int num) {
		return num%2==0;
		
	}
	public static void main(String[] args) {
		int test=70;
		if (Even(test)) {
			System.out.println(test+" Even");
		}else {
			System.out.println(test+" odd");
		}
	}

}
