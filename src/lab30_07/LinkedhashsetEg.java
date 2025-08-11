package lab30_07;

import java.util.LinkedHashSet;

public class LinkedhashsetEg {

	public static void main(String[] args) {
		
		// no duplicates are allowed
		//insertion order
		//only one null is allowed
		//not symnchronous
		//slightl slower than hash set
		
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		
		lh.add(null);
		lh.add("raju");
		lh.add("rani");
		lh.add("mantri");
		lh.add("police");
		lh.add("donga");
		lh.add(null);
		lh.add("raju");
		
		System.out.println(lh);
		
		System.out.println(lh.size());
		System.out.println(lh.remove(null));
		System.out.println(lh);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
