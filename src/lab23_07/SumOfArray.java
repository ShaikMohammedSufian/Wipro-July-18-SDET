package lab23_07;

public class SumOfArray {

	public static void main(String[] args) {
		int[]arr= {5,10,20};
		
		int sum=0;
		
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Sum "+sum);
	}

}
