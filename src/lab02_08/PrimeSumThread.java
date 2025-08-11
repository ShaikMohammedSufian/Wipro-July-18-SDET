package lab02_08;

public class PrimeSumThread {

	public static void main(String[] args) throws InterruptedException {

		PrimeSum t1 = new PrimeSum(1,50);
		PrimeSum t2 = new PrimeSum(51,100);
		
		t1.start();
		t2.start();
		
		
		
		t1.join();
		t2.join();
		
		int total = t1.sum+t2.sum;
		System.out.println("Sum "+total);
	}

}
