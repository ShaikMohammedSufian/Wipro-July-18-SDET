package Day3;

public class MultilevelSub2 extends MultilevelSub1{
	String a = "Human";
	public void Run() {
		System.out.println(a +" is Chasing "+Animal);
		System.out.println(Animal + " is Running");
	}

	public static void main(String[] args) {
		MultilevelSub2 obj = new MultilevelSub2();
		
		obj.bark();
		obj.Run();
	}

}
