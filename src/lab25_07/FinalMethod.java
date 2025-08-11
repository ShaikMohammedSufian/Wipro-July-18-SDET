package lab25_07;
class Parent{
 final void display() {
		System.out.println("final method cannot be override");
	}
}
class child extends Parent{
//	void display() {
//		System.out.println("trying to override");
//	}
}public class FinalMethod{

	public static void main(String[] args) {
		child obj = new child();
		obj.display();
	}

}
 
