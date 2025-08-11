package Day12Wrapper;

public class CookingTask extends Thread {
	
	private String task;
	
	//constructor
	
	CookingTask(String task){
		this.task=task;
	}
	
	
	public void run() {
		System.out.println(task+" is being prepared by "+Thread.currentThread().getName());
	}
	
}
