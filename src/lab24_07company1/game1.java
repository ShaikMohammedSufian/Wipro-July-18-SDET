package lab24_07company1;

public class game1 {
	String gamename = "Asphalt";
	int id = 566;
	String Type = " Racing";
	
	void Game() {
		System.out.println(gamename);
		System.out.println(id);
		System.out.println(Type);
	}
	public static void main(String[] args) {
		game1 obj = new game1();
		obj.Game();
	}

}
