package Day3;
//super
class An {
	public void eat() {
		System.out.println("Animal eat food");
		
	}

}
//sub1

class Dog extends An{
	public void bark() {
		System.out.println("Dog Barks");
	}
}
//sub2

class cat extends An{
	public void meow() {
		System.out.println("cat Meows");
	}
}

//sub3

class cow extends An{
	public void moo() {
		System.out.println("Cow moos");
	}
}

//main

class Animal{
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		cat c = new cat();
		c.meow();
		c.eat();
		
		cow cw = new cow();
		cw.moo();
		cw.eat();
		
		
	}
}