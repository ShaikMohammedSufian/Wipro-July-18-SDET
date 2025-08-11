package Day12Wrapper;

public class UseSyncClass {

	public static void main(String[] args) throws InterruptedException {


		ThreadSync cnt = new ThreadSync();
		
		//thread1 to increment counter
		
		Thread t1 = new Thread (()->{
			for(int i =0;i<500;i++) {
				cnt.inc();
			}
		});
		
		
		//thread 2 to increment the counter 
		
		Thread t2 = new Thread (()->{
			for(int i =0;i<600;i++) {
				cnt.inc();
			s}
		});
		// start both the threads
		t1.start();
		t2.start();
		//wait for threads to finish
		t1.join();
		t2.join();
		
		//print final counter value
		
		System.out.println(cnt.get());
		
		}
}
