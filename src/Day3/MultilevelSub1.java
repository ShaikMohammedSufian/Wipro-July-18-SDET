package Day3;

public class MultilevelSub1 extends MultilevelSuper {
	String Bird = "Crow";
	
	public void fly() {
		System.out.println(Bird +" is Flying");
		System.out.println(Animal +" is Barking");
	}
//	public static void main(String[] args) {
//		MultilevelSub1 obj = new MultilevelSub1();
//		obj.bark();
//		obj.fly();
//	}

}
