package lab23_07;

public class StringEg1 {

	public static void main(String[] args) {
		String s1 = "Core Java";
				 
        String s2 = "Selenium";
        
        System.out.println(s1);
        System.out.println(s2);

        // equals
        System.out.println(s1.equals(s2));

        // concatenation
        System.out.println(s1.concat(s2));

        // substring
        System.out.println("index 3 of s1: " + s1.substring(3));
        System.out.println("index 2 of s2: " + s2.substring(2));
        System.out.println("from index 1 to 4: " + s1.substring(1, 4));

        // contains
        System.out.println(s1.contains(s2));
        System.out.println(s1.contains("Java"));

        // replace
        System.out.println(s1.replace("a", "o"));
        System.out.println(s1.replaceAll(s1, "Python"));

        // endsWith
        System.out.println(s1.endsWith("a"));
        System.out.println(s2.endsWith("m"));

        // isEmpty
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        // join
        String joined = String.join("_", "Language", s1);
        System.out.println(joined);

        //split
        
        String a ="Automation With Java and Selenium";
        String[] b = a.split(" ");
        for(String i : b) {
        	System.out.print(i + ",");
        	
        }
        
        
	
				 
	}

}
