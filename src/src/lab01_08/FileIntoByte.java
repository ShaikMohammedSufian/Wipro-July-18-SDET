package lab01_08;

import java.io.File;
import java.io.FileInputStream;

public class FileIntoByte {

	public static void main(String[] args) {

		//firrst we give file path
		
        File f = new File("C:/Users/irfan/OneDrive/Desktop/SUFI CERTIFICATES/Wipro/output1.txt");
        
        try {
        	FileInputStream fis = new FileInputStream(f);
        	
        	byte[] data = new byte[(int) f.length()];
        	
        	fis.read(data);
        	
        	fis.close();
        	
        	System.out.println(new String (data));
        	
        }catch(Exception e) {
    		System.out.println(e);
    	}
        	
	}

}
