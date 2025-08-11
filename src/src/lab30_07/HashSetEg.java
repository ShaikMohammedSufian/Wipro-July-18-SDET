package lab30_07;



import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		
		// no duplicate
		//no guarenteed order
		//multiple nulls are allowed but printed only once
		//not synchronyze
		//operations are faster than the lists
		
		HashSet <String> h = new HashSet<>();
		h.add("car");
		h.add("bike");
		h.add("cycle");
		h.add("plane");
		h.add("jeep");
		h.add("jeep");
		h.add(null);
		h.add(null);
		h.add("100");
		
		
		System.out.println(h.isEmpty());
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.remove("jeep"));
		System.out.println(h);
		System.out.println(h.contains("tttt"));
		System.out.println(h.hashCode());
		
		
		
		
		
		
		
		
		
		
	}

}
