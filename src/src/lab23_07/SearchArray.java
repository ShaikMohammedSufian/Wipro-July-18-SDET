package lab23_07;

public class SearchArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int a =30;
		
		for (int i =0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println(a+" found at "+i +" index");
			}
		}
		
	}

}
