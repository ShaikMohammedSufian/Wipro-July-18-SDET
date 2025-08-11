package Day10;

import java.io.FileInputStream;

public class IoExample1 {

	public static void main(String[] args) {

		try {
			//file input stream bytes daata is read
		FileInputStream input = new FileInputStream("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//FileInputStream.txt");
		
		System.out.println("data in the field");
		
		//read the byte 
		
		int i = input.read();
		while(i!=-1) {
			System.out.print((char)i);
			//reads the next byte from the file
			i= input.read();
		}
		input.close();
		}
		
		
		catch(Exception e) {
			System.out.print(e);
		}
		
		
		
		
		
		
		
		
		
	}

}
