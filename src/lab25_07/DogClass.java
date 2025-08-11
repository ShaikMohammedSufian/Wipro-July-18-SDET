package lab25_07;

public class DogClass implements AnimalInterface{
	public void bark() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		DogClass d = new DogClass();
		d.bark();
	}

}
