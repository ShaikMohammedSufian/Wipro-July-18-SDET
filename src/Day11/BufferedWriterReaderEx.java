package Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderEx {
	public static void main(String[] args) throws IOException {
		
		// reading and  writing line by line buffereeed reader and writer is used
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//bufferedwriter.txt"));
		
		bw.write("i am writing a file in buffered reader");
		
		bw.close();
		
		// reading the file
		
		BufferedReader br = new BufferedReader(new FileReader("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//bufferedwriter.txt"));

		
		String l;
		
		while((l=br.readLine())!=null) {
			System.out.println(l);
		}
		
		
		
		
		
		
	}
	
	
	
}
