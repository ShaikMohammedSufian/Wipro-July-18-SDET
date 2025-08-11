package Day11;

import java.io.Serializable;

public class StudentSerializationEx implements Serializable {

	
	int id;
	String name;
	
	StudentSerializationEx(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	
}
