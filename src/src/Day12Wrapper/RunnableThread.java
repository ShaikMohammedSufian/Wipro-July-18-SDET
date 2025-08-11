package Day12Wrapper;

public class RunnableThread {

	public static void main(String[] args) {
		int n =10;
		for(int i=0;i<n;i++) {
			Thread t1 = new Thread(new RunnableEg());
			t1.start();
		
		}
		
		
		
		
		
		
	}

}
