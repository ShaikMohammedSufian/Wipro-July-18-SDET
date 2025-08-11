package lab30_07;

import java.util.ArrayList;


public class MaxNumber {

	public static void main(String[] args) {
		
		//Write a program to find the maximum element from an ArrayList of Integers.
		
		 ArrayList<Integer> l = new ArrayList<>();
		
		 	l.add(45);
	        l.add(22);
	        l.add(78);
	        l.add(14);
	        l.add(66);
	
	        
	             
	        System.out.println(l);
		
	        int max = l.get(0);
	        for (int i = 1; i < l.size(); i++) {
	            if (l.get(i) > max) {
	                max = l.get(i);
	            }
	        }
	        System.out.println("max : "+max);

	        
	        
//	       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
