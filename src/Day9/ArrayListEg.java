package Day9;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		//insertion of the data
		//remove,update etc
		al.add("Sue");
		al.add("roman");
		al.add("Tony");
		al.add("Hulk");
		al.add("Reed");
		al.add("emma");
		al.add("emma");
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Reed"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.set(2, "Bron"));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Hulk"));
		
		
		
	}

}
