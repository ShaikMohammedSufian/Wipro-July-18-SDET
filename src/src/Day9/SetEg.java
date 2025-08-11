package Day9;

import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		//Treeset Example
		//no duplicate is allowed 
		// no null is allowed
		//data displayed in asc order
		Set<String>st = new TreeSet<String>();
		
		st.add("car");
		st.add("bike");
		st.add("cycle");
		st.add("plane");
		st.add("jeep");
		st.add("jeep");
		st.add("null");
		st.add("100");
		
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.add("helicopter"));
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.remove("cycle"));//remove the object not index number
		System.out.println(st);
		System.out.println(st.contains("abc"));
		System.out.println(st);
		
		Set<Integer> s = new TreeSet<>();
		s.add(110);
		s.add(20);
		s.add(60);
		
		System.out.println(s);
		System.out.println(s.add(3));
		System.out.println(s);
		System.out.println(s.equals(st));
		System.out.println(s);
	}

}
