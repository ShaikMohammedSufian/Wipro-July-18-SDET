package lab02_08;

public class PrimeSum extends Thread{
	
	int start;
	int end;
	int sum=0;
	
	PrimeSum(int start,int end){
		this.start=start;
		this.end=end;
	}
	
	boolean Prime(int n) {
		if(n<2) return false;
		for (int i =2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
		
	}
	
	public void run() {
		for (int i = start;i<=end;i++) {
			if(Prime(i)) {
				sum+=i;
			}
		}
	}
}
