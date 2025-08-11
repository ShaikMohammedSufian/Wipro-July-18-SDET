package lab23_07;
//3. Write a Java program to create a class called Shape with a method
//called getArea(). Create a subclass called Rectangle that overrides 
//the getArea() method to calculate the area of a rectangle.
class sh{
	void getArea() {
		System.out.println("shape is square");
	}
}

class rectangle extends sh{
	void getArea() {
		System.out.println("Rectangle rules");
	}
}
public class Shape {

	public static void main(String[] args) {
		rectangle r =new rectangle();
		r.getArea();
	}

}
