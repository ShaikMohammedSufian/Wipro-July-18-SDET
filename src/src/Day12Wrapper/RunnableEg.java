package Day12Wrapper;

public class RunnableEg implements Runnable {
	
	public void run() {
		//System.out.println("thread is running");
		System.out.println("Thread   "+Thread.currentThread().getId()+" is running");
	}
	
	
}
