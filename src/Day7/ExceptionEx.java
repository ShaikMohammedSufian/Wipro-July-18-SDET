package Day7;

public class ExceptionEx {

	public static void main(String[] args) {
		        int[] numbers = {10, 20, 30};
		        
		        try {
		            // Risky code that might throw an exception
		            System.out.println("Element at index 5: " + numbers[5]);  // This will throw ArrayIndexOutOfBoundsException
		        } catch (ArrayIndexOutOfBoundsException e) {
		            // This block handles the exception
		            System.out.println("Exception caught: " + e);
		        } finally {
		            // This block always runs, even if an exception occurs or not
		            System.out.println("This is the finally block. It always executes.");
		        }

		        System.out.println("Program continues after try-catch-finally.");
    }
}

