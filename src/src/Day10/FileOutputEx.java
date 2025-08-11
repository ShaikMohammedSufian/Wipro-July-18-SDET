package Day10;

import java.io.FileOutputStream;

public class FileOutputEx {

	public static void main(String[] args) {
		
		String data = " I am attending java classes";
		
		try {
			FileOutputStream output = new FileOutputStream("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//output.txt");
			
			byte[] array = data.getBytes();
			//write the byte array to the file
			
			output.write(array);
			output.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
	}

}
