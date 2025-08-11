package lab30_07;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEg {

	public static void main(String[] args) {
		
		//Create a set  and  find Duplicate Elements in set
		
		 String[]a = {"bike","car","bike"};
		 Set<String> s = new HashSet<>();
		 
		
		 
		 System.out.println("duplicate");
		for (int i =0;i<a.length;i++) {
			if(s.contains(a[i])) {
				System.out.println(a[i]);
			}else {
				s.add(a[i]);
			}
		}
		
		
		
		
	}

}
