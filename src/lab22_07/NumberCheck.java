package lab22_07;

public class NumberCheck {

	public static void main(String[] args) {
		int number = -5;

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
	}

}
