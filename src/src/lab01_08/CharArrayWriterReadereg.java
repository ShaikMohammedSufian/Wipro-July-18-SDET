package lab01_08;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterReadereg {

	public static void main(String[] args) throws IOException {
		// creating a chararraywriter and write data 
	
		//CharArrayWriter stores characters directly in memory,
		//not in external files.
		
		
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("Iam writing this using chararray writer");
		
		// converting data in char
		char[] data = cw.toCharArray();
		
		// print using chararrayreader
		
		CharArrayReader cr = new CharArrayReader(data);
		
		int ch;
		
		while((ch = cr.read())!=-1) {
			System.out.print((char)ch);
		}
		
		cw.close();
		cr.close();
		
		
		
		
		
		
		
		
		
	}
}
