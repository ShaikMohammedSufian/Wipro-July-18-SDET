package Day10;

import java.io.ByteArrayOutputStream;

public class BytearrayoutputstreamEg {

	public static void main(String[] args) {
		
		String data = "This is a line of text insode the string";
		
		try {
			//create a byte output stream
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			
			byte[] array = data.getBytes();
			
			
			//writedata to output stream
			
			out.write(array);
			
			//retrieve data from the output stream in string format
			
			String streamData = out.toString();
			System.out.println("Output Stream : "+ streamData);
			out.close();
			
		}catch (Exception e) {
			System.out.println(e);
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
