package Day1and2;

public class Operators {

	public static void main(String[] args) {
		//unary operators
		
		int i = 5;
		System.out.println("Unary");
		System.out.println(i);
		
		i++;
		
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		System.out.println("Arthimetic");
		//Arthimetic Opereators
		
		int a = 5;
		
		int b = 6;
		
		int c = a+b;
		
		System.out.println(c);
		
		int d =a - b ;
		
		System.out.println(d);
		
		int e = a/b;
		System.out.println(e);
		
		int f = a*b;
		System.out.println(f);
		
		//shift operators
		System.out.println("Left Shift");
		System.out.println(10<<2);
		System.out.println(20<<5);
		
		//right shift 
		System.out.println("right shift");
		System.out.println(50>>2);
		System.out.println(56>>4);
		System.out.println(" relational");
		//relational or comaprison operators
		/* == is equal to 
		 * != is not equal to
		 * < less than
		 * >greater than
		 * <= less than equal to
		 * >= greater than equal to */
		int s = 10;
		int r = 10;
		
		System.out.println(s==r);
		System.out.println(s!=r);
		System.out.println(s>r);
		System.out.println(s<r);
		System.out.println(s>=r);
		System.out.println(s<=r);
		System.out.println("line break");
		int a1=22;
		int b1 = 55;
		
		System.out.println("line break");
		System.out.println(a1!=b1);
		System.out.println("line break");
		int a2 = 5;
		int b2 = 2;
		System.out.println(a2>b2);
		System.out.println(a2<b2);
		
		System.out.println("line break");
		
		int c1 = 66;
		int c2 = 65;
		
		System.out.println(c1>=c2);
		System.out.println(c1<=c2);
		
		//Bitwise opreators
		//AND
		int p = 5; //0101
		int q = 3; //0011
		
		int r1 = p & q; //0001
		
		System.out.println(r1);
		
		
		//OR any one 
		
		int x =5;
		int y = 3;
		int z= x|y;
		
		System.out.println(z);
		
		//XOR present in anyone but not in both
		
		int g=8;//1000
		int k=2;//0010
		
		int h = g^k;
		
		System.out.println(h);
		
		//logical operators
		//&& - returns if both are true
		int u = 10 ,v=20;
		
		if (u<v && v>15) {
			System.out.println("both are true");
			
		}
		//|| - returns trie ig any one is true
		
		int age = 25;
		
		if (age <18 || age > 26) {
			
			System.out.println("okay");
			
		}
		
		//! - NOT - reverse the lofical state of operatand 
		
		
		boolean rain = false;
		if (!rain) {
			System.out.println("out");
		}
		else {
			System.out.println("no");
		}
		System.out.println(" Assignment");

		// asssignment   = += -=
		
		int m = 10;
		int n = 20;
		
		m+=4; // m= m+4=10+40=14
		
		System.out.println(m);
		
		n-=4;//n=n-4 = 20-4=16
		System.out.println(n);
		System.out.println(" ternary");

		
		//ternary operators short hand for if -else
		
		//condition? expression_if_true : expression _if -false;
		
		int z1=10,z2=20;
		int max = (z1<z2)?z1:z2;
		System.out.println(max);
				
	}

}
