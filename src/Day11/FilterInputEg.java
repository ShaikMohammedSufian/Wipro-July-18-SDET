package Day11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputEg {

	public static void main(String[] args) {
//filtet streams filter data as they read and write data in the input
		
	//filter it and padd to underlying streams
		
		FileInputStream fis = null;
		
		FilterInputStream filterinput = null;
		
		try {
			//create file input stream
			
			fis = new FileInputStream("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//output.txt");
			
			// wrapping file input stream with buffered input stream
			
			filterinput= new BufferedInputStream(fis);
			
			//read and print file content
			
			int data;
			
			while((data = filterinput.read())!=-1) {
				System.out.print((char)data);
			}
			
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
