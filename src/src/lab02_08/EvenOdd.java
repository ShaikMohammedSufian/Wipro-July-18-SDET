package lab02_08;

public class EvenOdd extends Thread{
	
	public void even() {
		for (int i =0;i<=10;i+=2) {
			System.out.println("Even : "+ i);
		}
	}
	
	public void odd() {
		for(int j=1;j<=10;j+=2) {
			System.out.println("Odd : "+j);
		}
	}
	
	public void run() {
		even();
		odd();
	}
	
}
/*package demo;

// 2. Use two threads to print even and odd numbers.

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class lab_prog26 {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        et.start();
        ot.start();
    }
}
*/