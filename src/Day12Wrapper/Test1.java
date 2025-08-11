package Day12Wrapper;


class Test1 extends NewThread	{		
public static void main(String[] args) {
	
	NewThread t1 = new NewThread();
	
	t1.start();
}
}


class ao extends NewThread	{		
public static void main(String[] args) {
	
	NewThread t1 = new NewThread();
	
	t1.start();
}
}



/*class Samplethread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("samplethread");
	}
	}
	
	
}
 
public class thread {
	public static void main(String[] args) {
		Samplethread st=new Samplethread();
		
		st.start();
		for(int i=1;i<=5;i++) {
			System.out.println("mainthread");
		}
	}
 
}*/