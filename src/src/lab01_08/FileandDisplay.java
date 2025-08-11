package lab01_08;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileandDisplay {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:/Users/irfan/OneDrive/Desktop/SUFI CERTIFICATES/Wipro/students.txt"));
			
			String line;
			
			while((line = br.readLine())!= null){
				System.out.println(line);
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	 	
	}

}
