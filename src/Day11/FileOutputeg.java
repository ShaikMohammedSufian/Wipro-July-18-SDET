package Day11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileOutputeg {
	
	
	public static void main(String[] args) throws IOException {
		//filtet streams filter data as they read and write data in the input
				
			//filter it and padd to underlying streams
				
				FileOutputStream fos = null;
				
				FilterOutputStream filterout = null;
				
				try {
					//create file output stream to write
					
					fos = new FileOutputStream("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//output1.txt");
					
					// wrapping file output stream with buffered output stream
					
					filterout= new BufferedOutputStream(fos);
					
					//write file content
					
					String text = "hi how are you where are you right now";
					filterout.write(text.getBytes());
					
					
					 
				}catch(Exception e) {
					System.out.println(e);
				}
				finally {
					filterout.close();
				    fos.close();
				}
				
			}

	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
}
