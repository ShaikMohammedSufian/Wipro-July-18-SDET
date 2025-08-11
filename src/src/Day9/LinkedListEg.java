package Day9;

import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		//insertion
		
		//insertion of the data
				//remove,update etc
				ll.add("Sage");
				ll.add("roman");
				ll.add("Rosy");
				ll.add("Hulk");
				ll.add("Reed");
				ll.add("Ash");
				ll.add("emma");
				ll.add(null);
				System.out.println(ll);
				System.out.println(ll.get(2));
				System.out.println(ll.indexOf("Reed"));
				System.out.println(ll.isEmpty());
				System.out.println(ll.remove(0));
				System.out.println(ll);
				System.out.println(ll.set(2, "Bron"));
				System.out.println(ll);
				System.out.println(ll.size());
				System.out.println(ll.contains("Hulk"));
				
		
		
		
	}

}
