// File: BankMain.java
package lab24_07;


abstract class BankAccount {
    String accountNumber;
    double balance;

    // abstract
    abstract void calcInterest();

    
    public void showBalance() {
        System.out.println("Acc Number: " + accountNumber);
        System.out.println("Balance" + balance);
    }
}


class SavingsAccount extends BankAccount {
     
    void calcInterest() {
        
        System.out.println("Interest on SA: 62552424");
    }
}


class FixedDepositAccount extends BankAccount {
    // Overriding 
    void calcInterest() {
       
        System.out.println("Interest on FD Account 66546834");
    }
}


public class BankMain {
    public static void main(String[] args) {

        
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "SA123";
        sa.balance = 10000;
        sa.showBalance();
        sa.calcInterest();

      

        
        FixedDepositAccount fda = new FixedDepositAccount();
        fda.accountNumber = "FD456";
        fda.balance = 20000;
        fda.showBalance();
        fda.calcInterest();
    }
}
