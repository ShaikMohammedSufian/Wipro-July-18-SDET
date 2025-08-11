package lab31_07;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		int a[]  = {15,22,66,74,84};
		
		System.out.println(Arrays.toString(a));
		
		
		Arrays.sort(a);
		
		int i = a.length-1;
		
		
		while (a[i]==a[a.length-1]) {
			i--;
		}
		System.out.println(a[i]);
//		
//		
		
		
		
		
		
		
	}

}
