package Day5;

public class EncapsulationEg {
	//private fields hiddenfrom ouside access
	private String name;
	private int age;
	
	//public getter method for nmae
	
	public String getname() {
		return name;
	}
	
	//public setter method for name
	
	public void setname (String name) {
		this.name=name;
	}
	
	//public get for age
	
	public int getage() {
		return age;
	}
	
	//public setter for age
	
	public void setage(int age) {
		this.age=age;
	}
	public static void main(String[] args) {
		EncapsulationEg obj = new EncapsulationEg();
		obj.setage(23);
		obj.setname("sss");
		
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		
		
	}

}
