package lab31_07;

public class Stringex1 {

	public static void main(String[] args) {
		
		String s ="a2b3c4";
		String r ="";
		
		for (int i =0; i < s.length();i+=2) {
			
			char ch = s.charAt(i);
			
			int count = s.charAt(i+1)-'0';
			
			for (int j =0;j< count;j++) {
				r+=ch;
			}
		}
		System.out.println(r);
		
	}

}
