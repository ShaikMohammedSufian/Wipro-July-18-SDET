package Day11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterReaderEg {

	public static void main(String[] args) throws IOException {
		 
		//write to file using file writer
		
	FileWriter fw = new FileWriter("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//fileWriterReader1.txt");
		
		fw.write("I am a file writer");
		
		fw.close();
		
		//reading from file using file reader
		
		
		FileReader fr = new FileReader("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//fileWriterReader1.txt");
		
		int i;
		while ( (i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
