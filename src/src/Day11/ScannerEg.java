package Day11;

import java.util.Scanner;

public class ScannerEg {

	public static void main(String[] args) {
		//creating the scanner class
		
		Scanner sc = new Scanner(System.in);
		
		//enter name
		
		System.out.println("Enter the first number : ");
		
		int a = sc.nextInt();
		
		System.out.println("ENter the second number :  ");
		
		int b = sc.nextInt();
		
		System.out.println("sum : "+(a+b));
		
		sc.close();
		
		
		
		
		
	}
	
	
}
