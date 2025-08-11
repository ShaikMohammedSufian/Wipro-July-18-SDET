package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEg {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {


		
		//create the streamand read the object
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(("C://Users//irfan//OneDrive//Desktop//SUFI CERTIFICATES//Wipro//Serialiazation.txt")));
		
		
		StudentSerializationEx s = (StudentSerializationEx)in.readObject();
		
		// print the object detaills
		
		System.out.println("Id : "+s.id+" "+" Name : "+s.name);
		
		in.close();
		
		
		
		
	}

}
