package lab02_08;

public class HelloWorldThread extends Thread {
	
	   public void run() {
           System.out.println("Hello world!");
       }
	
	 public static void main(String[] args) {

		 HelloWorldThread thread = new HelloWorldThread();
	        thread.start();  // start the thread
	 }
}


