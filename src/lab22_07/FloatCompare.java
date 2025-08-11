package lab22_07;

public class FloatCompare {

	public static void main(String[] args) {
		
		double num1=1235.4567;
		double num2=1235.4599;
		
		int a = (int)(num1 * 100);
        int b = (int)(num2 * 100);

        if (a == b) {
            System.out.println("Both numbers are the same ");
        } else {
            System.out.println("Numbers are different .");
        }
       
	}

}
