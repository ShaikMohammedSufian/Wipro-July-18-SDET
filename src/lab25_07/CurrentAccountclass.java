package lab25_07;

public class CurrentAccountclass implements AccountInterface{
	public void deposit() {
        System.out.println("Deposited 5600 into Current Account");
    }

    public void withdraw() {
        System.out.println("Withdrew 3500 from Current Account");
    }

    public void Interest() {
        System.out.println("Current Account interest: 0 percent");
    }

    public void Balance() {
        System.out.println("Current Account Balance: 452845");
    }

	public static void main(String[] args) {
		CurrentAccountclass c = new CurrentAccountclass();
		c.deposit();
		c.withdraw();
		c.Interest();
		c.Balance();
	}

}
