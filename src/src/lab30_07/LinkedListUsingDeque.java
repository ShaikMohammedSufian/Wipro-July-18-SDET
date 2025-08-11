package lab30_07;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDeque {

	public static void main(String[] args) {
		Deque<String> l = new LinkedList<>();
		l.add("Sony");
		l.addLast("Vivo");
		l.add("Oppo");
		l.add("Redmi");
		System.out.println(l);
		System.out.println(l.offer("dds"));
		System.out.println(l.removeFirst());
		System.out.println(l);
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l);
		System.out.println(l.peekFirst());
		System.out.println(l);
		l.addFirst("hhh");
		System.out.println(l);
		
		
		
		
		
		
	}

}
