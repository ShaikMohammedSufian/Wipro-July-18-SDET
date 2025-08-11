package Day10;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {

		/*
		 * each key can map only one value
		 * only one null key is allowed
		 * no duplicate key is allowed
		 * values can have multiple null and duplicate
		 * order is natural order like ascending order
		 * it is not synchronized
		 * no null key is allowed
		 * 
		 * */
		

		Map<Integer, String> m = new TreeMap<Integer, String>();

		m.put(1, "Ajay");
		m.put(2, "Vihar");
		m.put(3, "Raju");
		//m.put(null, null);//no null key is allowed
		m.put(3, null);
		m.put(9, "Ajay");
		m.put(6, "kk");
		m.put(5, null);
		
		
		
		
		
		
		 for(Map.Entry entry : m.entrySet()){
		 System.out.println("key : "+entry.getKey()+"    "+" Values : "+entry.getValue());}
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
