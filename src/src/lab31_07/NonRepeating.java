package lab31_07;

public class NonRepeating {

	public static void main(String[] args) {
		
		String s = "aabbcdeff";
		
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

		
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;
		
		
            }
        }

	}

}
