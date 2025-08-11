package lab30_07;

import java.util.Stack;

public class Stackeg {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		
		s.push("tiger");
		s.push("lion");
		s.add("monkey");
		s.push("dog");
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("lion"));
		System.out.println(s.add("cat"));
		System.out.println(s);
		System.out.println(s.elementAt(2));
		System.out.println(s.lastElement());
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.indexOf("cat"));
		s.insertElementAt("Crow", 2);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.hashCode());
		System.out.println(s);
		
		
		
		
		
		
	}

}
