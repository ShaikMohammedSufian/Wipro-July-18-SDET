package Day3;

public class StringsEg1 {

	public static void main(String[] args) {
		//1st method to define a sttring
		String S1 = "Hello World";
		System.out.println(S1);
		
		//2nd
		
		char[]ch = {'h','e','l','l','o'};
		String S2= new String(ch);
		System.out.println(ch);
		
		//3rd
		
		String S3= new String ("Bye");
		System.out.println(S3);
		
		//String methods
		
		//equals
		
		String str1 ="Mumbai";
		String str2 ="Delhi";
		
		System.out.println(str1.equals(str2));
		
		//concatination
		
		System.out.println(str1.concat(str2));
		
		//substring
		
		System.out.println(str1.substring(3));
		System.out.println(str2.substring(2));
		
		System.out.println(str1.substring(1, 4));
		
		//contains
		
		System.out.println(str1.contains(str2));
		System.out.println(str1.contains("i"));
		
		//replace
		
		System.out.println(str1.replace("i", "s"));
		
		System.out.println(str1.replaceAll(str1,"Pune"));
		
		
		//endswith
		
		System.out.println(str1.endsWith("i"));
		
		//isempty
		
		System.out.println(str2.isEmpty());
		
		//join
		String str3 = String.join("_", "City",str1);//wrong
		
		System.out.println(str3);
		
		//split
		
		String t = "java is programming language";
		String[]result = t.split(" ");
		
		for (String str : result) {
			System.out.print(str + " ,");
		}
		
	}

}
