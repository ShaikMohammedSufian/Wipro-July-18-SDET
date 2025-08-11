package Day5;

public class Circle implements CircleShape {
	//method coming from shape interface
	
	public void draw() {
		System.out.println("Drawing Circle");
	}
	//method coming from circleshape interface
	public void radius () {
		System.out.println("Radius is 10 units");
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		c.radius();
	}

}
