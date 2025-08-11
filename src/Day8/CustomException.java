package Day8;

public class CustomException {
	public static void checkage(int age) throws Exception{
	if (age<18) {
		System.out.println("create a new keyword");
		//using throw keyword
		throw new Exception("age cannot be zero");
	}
	}
	public static void main(String[] args) throws Exception {
		CustomException o = new CustomException();
		o.checkage(5);
	}

}
