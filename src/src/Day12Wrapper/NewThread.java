package Day12Wrapper;

class NewThread extends Thread{
	//create a thread using thread class
	
	
			public void run() {
				System.out.println("Thread is running");
			}
		
		
		
			class Test	{		
				public static void main(String[] args) {
					
					NewThread t1 = new NewThread();
					
					t1.start();
				}
				}
		
		
		
		
		
		
		
		
	}


