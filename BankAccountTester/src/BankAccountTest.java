/**
 * 
 */

/**
 * @author Zac
 *
 */
public class BankAccountTest {

	private double balance;
	// Constructors
	public BankAccountTest() {
		// constructor
		balance = 0;
	}

	public BankAccountTest(double amount) {
		// second constructor for initial balance.
		balance = amount;
	}
	//Methods
	public void deposit(double amount) {
		// Deposit into account.
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		// Withdraw from account.
		balance = balance - amount;
	}
	
	public double getBalance() {
		// Display account balance.
		return balance;
	}
	
	public void addInterest(double rate) {
		balance = balance * (1+(rate/100.0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountTest reggiesChecking = new BankAccountTest();
		reggiesChecking.deposit(1000);
		reggiesChecking.withdraw(500);
		reggiesChecking.withdraw(400);
		System.out.println(reggiesChecking.getBalance());
		
		
		BankAccountTest megsLoan = new BankAccountTest(1000);
		megsLoan.addInterest(10);
		System.out.println(megsLoan.getBalance());
		System.out.println("Expected:" + 1100);

	}

}
