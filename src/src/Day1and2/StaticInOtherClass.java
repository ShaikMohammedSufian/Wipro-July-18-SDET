package Day1and2;

public class StaticInOtherClass {

	public static void main(String[] args) {
		//access static variables of other class in new class you need to syso and otherclassname and static variable name 
		
		System.out.println(StaticVariable.StuName);
		
		System.out.println(StaticVariable.id);
		
		//Access non static variable of other class you need to first declare obejct of other class in new class like bwlow
		
		
		StaticVariable deu = new StaticVariable();
		
		System.out.println("college name : "+deu.clg);
		
		// StaticVariable is other class name and de is object and to access non static in other file you need to printout objectname dot variable name like deu.clg 
	}

}
