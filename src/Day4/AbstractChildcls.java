package Day4;

public class AbstractChildcls extends AbstractClassEg1{
	void makesound() {
		System.out.println("sounding");
	}
	public static void main(String[] args) {
		AbstractChildcls obj = new AbstractChildcls();
		obj.eat();
		obj.makesound();
		System.out.println(Animalname);
		
	}

}
