package lab30_07;

import java.util.LinkedList;

public class EqualLinkedList {

	public static void main(String[] args) {
		
		//Write a program to check if two LinkedLists are equal.
		
		LinkedList <String> l1 = new LinkedList<>();
		
		l1.add("aa");
		l1.add("bb");
		
		System.out.println(l1+" 1st list");
		
		LinkedList <String> l2 = new LinkedList<>();
		
		
		l2.add("aa");
		l2.add("bb");
		System.out.println(l2+" 2nd list");
		
		if(l1.equals(l2)) {
			System.out.println("Both linkedlists are same");
		}else {
			System.out.println("Not same");
		}
		
		
		
	}

}
