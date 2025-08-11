package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapex {

	public static void main(String[] args) {
		/*
		 * each key can map only one value
		 * only one null key is allowed
		 * no duplicate key is allowed
		 * values can have multiple null and duplicate*/
		
		
		
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Ajay");
		m.put(2, "Vihar");
		m.put(3, "Raju");
		m.put(null, null);
		m.put(3, null);
		m.put(9, "Ajay");
		m.put(null, "Vihar");
		m.put(6, "kk");
		
		
		
		
		
		
		
		
		
		//System.out.println(m);
		
		//converting map to set
		/*Set s = m.entrySet();		
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			System.out.println("Key : "+entry.getKey()+"    "+" Values : "+entry.getValue());
			
			}
		*/
		
		 
		 for(Map.Entry entry : m.entrySet()){
		 System.out.println("key : "+entry.getKey()+"    "+" Values : "+entry.getValue());}
		 
		 
		 
		 
		 
		 
		 
		 
		
		/*| Concept         | Meaning                                      |
| --------------- | -------------------------------------------- |
| `Map`           | Interface that stores key-value pairs        |
| `HashMap`       | Implementation of `Map`, no order guaranteed |
| `put(key, val)` | Adds a key-value pair                        |
| `entrySet()`    | Returns a set of all key-value pairs         |
| `Map.Entry`     | Represents one key-value pair                |
| `getKey()`      | Returns the key of a Map.Entry               |
| `getValue()`    | Returns the value of a Map.Entry             |
| `for-each` loop | Simplified loop to iterate over collections  |


for (DataType variable : collection) {
    // Use variable
}


for(Map.Entry entry : m.entrySet()){
		 System.out.println(entry.getKey()+" "+entry.getValue());}
		 

*/
		
		
		
		
		
		
		
		
		
		
	}

}
