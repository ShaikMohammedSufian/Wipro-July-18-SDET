package Day4;

abstract class AbstractClassEg1 {
    //abstract methods
	
	abstract void makesound();
	
	//normal method
	
	public void eat() {
		System.out.println("eating food");
	}
	//constructor
	AbstractClassEg1(){
		System.out.println("creating constructor in abstract class");
		
	}
	
	//instance variable
	
	public static String Animalname = "Lion";
	
	//final variable
	
	private final String animalbeh ="Roars";
	
//	public static void main(String[] args) {
		//AbstractClassEg1 obj = new AbstractClassEg1();
//	}
}
