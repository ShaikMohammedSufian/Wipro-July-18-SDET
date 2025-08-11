package lab30_07;

import java.util.ArrayList;
import java.util.Collections;
public class Secondlargest {

	public static void main(String[] args) {
		//3.Write a program to find the second-largest element in an ArrayList of Integers.
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(40);
        a.add(10);
        a.add(30);
        a.add(20);
        a.add(50);
        
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        int n = a.get(1);
	
        System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
