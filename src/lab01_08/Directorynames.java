package lab01_08;

import java.io.File;

public class Directorynames {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\irfan\\OneDrive\\Desktop");
		
		String[] s = f.list();
		
		//print each item
		
		for(String n : s) {
			System.out.println(n);
		}
			
	}

}
