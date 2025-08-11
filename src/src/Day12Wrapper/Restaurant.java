package Day12Wrapper;

public class Restaurant {

	public static void main(String[] args) {
		
//		Thread t1 = new Thread("Dosa");
//		Thread t2 = new Thread("Poori");
//		Thread t3 = new Thread("Idly");
//		Thread t4 = new Thread("vada");
//		Thread t5 = new Thread("Pasta");
		
		
		CookingTask t1 = new CookingTask("Dosa");
        CookingTask t2 = new CookingTask("Poori");
        CookingTask t3 = new CookingTask("Idly");
        CookingTask t4 = new CookingTask("Vada");
        CookingTask t5 = new CookingTask("Pasta");
        
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
