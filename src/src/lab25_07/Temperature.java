package lab25_07;
/*Create a Temperature class
Private field: celsius
Provide:
Method to set temperature
Method to convert to Fahrenheit
Method to convert to Kelvin
Apply encapsulation and validation for physical temperature limits.
*/
public class Temperature {
	private double celsius;
	//setter
	public void setcelsius(double celcius) {
		if (celcius >= -273) {
			this.celsius = celcius;
		} else {
			System.out.println("Temperature cannot be below -273");
		}
	}
	
	//getter
	

	public double fahrenheit() {
		return (celsius*9/5)+32;
	}
	
	public double kelvin() {
		return celsius + 273;
	}
	
	//display
	
	public void display() {
		
		System.out.println("farenhiet "+fahrenheit());
		System.out.println("kelvin "+kelvin());
		
	}
	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.setcelsius(66);
		t.display();
	}

}
