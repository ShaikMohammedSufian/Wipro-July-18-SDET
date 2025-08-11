package lab23_07;

//1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
//super class?
class An{
	
	void makeSound() {
		System.out.println("Animal is making sound");
	}
}
//sub class
class cat extends An{
	
	void makeSound() {
		System.out.println("Bark");
	}
}

public class Animal {

	public static void main(String[] args) {
		cat c = new cat();
		c.makeSound();
	}

}
