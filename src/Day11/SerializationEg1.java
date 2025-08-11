package Day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEg1 {

	public static void main(String[] args) {
		
		try {
			
			//serilaiaztion is process of converting objects into bytes
			
			//write object
			//create the object
			
			StudentSerializationEx s1 = new StudentSerializationEx(22,"Ash");
			
			// creatung the out put stream writin gthe object
			
			FileOutputStream fout = new FileOutputStream("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//Serialiazation.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.flush();
			//closing the stream
			
			fout.close();
			out.close();
			
			System.out.println("object is Serialized");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}

}
