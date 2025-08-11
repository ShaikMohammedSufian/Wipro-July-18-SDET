package lab23_07;

public class StringBufferex1 {

	public static void main(String[] args) {
StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb);
		
		//append
		 sb.append("world");
		 
	        System.out.println("append: " + sb); 

	        // insert() – insert at index 5

	        System.out.println("insert: " + sb.insert(5, " ")); 

	        // delete() – delete index 5 to 6 mean removes space
	        

	        System.out.println("delete: " + sb.delete(5, 6)); 

	        // replace() – replace index 5 - 10 with "JAVA"
	        
	       
	        System.out.println("After replace: " + sb.replace(5, 10, "JAVA")); 

	        // substring() – get substring from index 5 to end
	        
	        
	        System.out.println("index 5: " + sb.substring(5)); 

	        // char at index() – char at index 1
	        
	       
	        System.out.println(sb.charAt(0)); 

	        // indexOf() – find index of A
	        
	       
	        System.out.println("Index  " + sb.indexOf("V")); 
	        
	        // length() 
	        
	        System.out.println( sb.length());

	        // reverse()
	       
	        System.out.println(sb.reverse()); 
	        
	        // isEmpty() 

	        System.out.println(sb.isEmpty());
	        //repeat
	        
	}

}
