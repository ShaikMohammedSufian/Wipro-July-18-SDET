package Day12Wrapper;

public class ThreadSync {
	
	private int c =0;//shared varaible
	
	//sync method to increment counter
	
	public synchronized void inc() {
		c++;
	}
	
	//sync method to get counter
	
	public synchronized int get() {
		return c;
	}
	
	
	
	
	
	
	
	
	
}
