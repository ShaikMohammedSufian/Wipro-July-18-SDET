package lab23_07;

public class StringBuildereg1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		
		System.out.println(sb);
		
		//append
		 sb.append("world");
		 
	        System.out.println("append: " + sb); 

	        // insert() – insert at index 5

	        System.out.println("insert: " + sb.insert(5, " ")); 

	        // delete() – delete index 5 to 6 mean removes space
	        

	        System.out.println("delete: " + sb.delete(5, 6)); 

	        // replace() – replace index 5 - 10 with "PYTHON"
	        
	       
	        System.out.println("After replace: " + sb.replace(4, 9, "PYTHON")); 

	        // substring() – get substring from index 6 to end
	        
	        
	        System.out.println("index 5: " + sb.substring(6)); 

	        // char at index() – char at index
	        
	       
	        System.out.println(sb.charAt(6)); 

	        // indexOf() – find index of A
	        
	       
	        System.out.println("Index  " + sb.indexOf("N")); 
	        
	        // length() 
	        
	        System.out.println( sb.length());

	        // reverse()
	       
	        System.out.println(sb.reverse()); 
	        
	        // isEmpty() 

	        System.out.println(sb.isEmpty());

	        //repeat
	}

}
