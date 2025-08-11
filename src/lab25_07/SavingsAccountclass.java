package lab25_07;

public class SavingsAccountclass implements AccountInterface{
	public void deposit() {
        System.out.println("Deposited 1020 into Savings Account");
    }

    public void withdraw() {
        System.out.println("Withdrew 2500 from Savings Account");
    }

    public void Interest() {
        System.out.println("Savings Account interest: 15 percent");
    }

    public void Balance() {
        System.out.println("Savings Account Balance: 50500");
    }

	public static void main(String[] args) {
		SavingsAccountclass s = new SavingsAccountclass();
		s.deposit();
		s.withdraw();
		s.Interest();
		s.Balance();
	}

}
