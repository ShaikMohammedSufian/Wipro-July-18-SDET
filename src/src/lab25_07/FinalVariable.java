package lab25_07;

class FinalVariable {
	final int a = 10;
		void show() {
			System.out.println(a);
			//a =200;//cannot be changed becuase of final
		}
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.show();
	}

}
