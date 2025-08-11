package lab24_07;

public class OverloadingDiffDatatypes {
	 // Adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Adding two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Adding two longs
    public long add(long a, long b) {
        return a + b;
    }

    // Adding two Strings (concatenation)
    public String add(String a, String b) {
        return a + b;
    }

	public static void main(String[] args) {
		OverloadingDiffDatatypes calc =new OverloadingDiffDatatypes();
		// Test each overloaded method
        System.out.println( calc.add(10, 20));                // int
        System.out.println( calc.add(10.5, 20.3));         // double
        System.out.println( calc.add(5.5f, 4.5f));          // float
        System.out.println(calc.add(100000000L, 200000000L)); // long
        System.out.println( calc.add("Hello, ", "World!")); // String
	}

}
