package Day10;

import java.io.ByteArrayInputStream;

public class BytearrayInputstreamEg {

	public static void main(String[] args) {
		//read the array of input data
		byte [] array= {1,2,3,4};		
		
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			
			for ( int i =0;i<array.length;i++) {
				//read bytes 
				
				int data = input.read();
				
				System.out.println(data);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
	}

}
