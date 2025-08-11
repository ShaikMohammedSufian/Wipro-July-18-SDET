package lab01_08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Stringreadereg {

    public static void main(String[] args) throws IOException {

        // StringWriter stores characters in memory
        StringWriter sw = new StringWriter();
        sw.write("this is a file writing using string writer ");

        // Convert to string
        String data = sw.toString();

        // Use StringReader to read character by character
        StringReader sr = new StringReader(data);

        // Also write output to a file
        FileWriter fw = new FileWriter("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//Stringreader.txt");

        int s;
        while ((s = sr.read()) != -1) {
            char ch = (char) s;
            System.out.print(ch);       // Print to console
            fw.write(ch);               // Write to file
        }

        // Close all resources
        fw.close();
        sw.close();
        sr.close();

        System.out.println("\n\nData successfully written to output.txt");
    }
}



/*package lab01_08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Stringreadereg {

	public static void main(String[] args) throws IOException {
		
		//read and write stringreader and writer
		
		//StringWriter stores characters directly in memory, 
		//not in external files.
		
		
		StringWriter sw = new StringWriter();
		
		
		sw.write("this is a file writing using string writer ");
		
		String data  = sw.toString();
		
		//System.out.println(data);
		
		StringReader sr = new StringReader(data);
		
		int s;
		
		while((s=sr.read())!=-1) {
			System.out.print((char)s);
		}
		
		sw.close();
		sr.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
*/
