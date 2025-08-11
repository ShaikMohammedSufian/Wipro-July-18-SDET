package Day9;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListUsingQueue {

	public static void main(String[] args) {
		Queue<String> lang = new LinkedList<>();
		
		
		
		lang.add("Python");
		lang.add("C");
		lang.add("C++");
		System.out.println(lang);
		
		//access forst element
		System.out.println(lang.peek());
		//remove
		System.out.println(lang.remove("C"));
		System.out.println(lang);
		//poll
		System.out.println(lang.poll());
		System.out.println(lang);
		
	}

}
