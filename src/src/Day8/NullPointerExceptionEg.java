package Day8;

public class NullPointerExceptionEg {

	public static void main(String[] args) {
		try {
			String s1=null;
			System.out.println(s1.length());
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[7]);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
