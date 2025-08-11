package Day8;

public class TrymultipleCatchException {

	public static void main(String[] args) {
		try {
			int[]arr= {5,6,7,8};
			int r=arr[8]/0;
			
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}catch(Exception e) {
			System.out.println("Some other exception");
		}
	}

}
