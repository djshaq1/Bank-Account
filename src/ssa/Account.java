package ssa;

public class Account {
	private int id;
	private String description;
	private double balance;
	
	
	
	void getDetails() { //method for all account info
		 System.out.printf(description + "  id is "+ id + " and my balance is  %.2f ", + balance); 
		 System.out.println(" ");
	}
	void deposit (double addMoney) { 
		balance = balance + addMoney;
		System.out.printf(" I made a deposit in the amount of %.2f ", addMoney);
		
	}
	void withdraw (double takemoney) {
		if (takemoney <= balance) {
			balance = balance - takemoney;
		System.out.printf(" I made a withdrawal in the amount of %.2f ", takemoney);
		}
		else System.out.println("Insufficient funds. Do Not withdraw!");
		}
	String print() { // returning string of account id & balance
		return " Account " + id + " balance is $" + String.format("%.2f",balance);
	}
		

	public Account(int id, String description) { //allowing way to change id & description inside of class
		this.id = id;
		this.description = description;
	}
	public Account(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
		
	}
	public void setDescription(String description) {
		this.description = description;
		
		
	}
	public Account() { //Initializing balance to 0
		this.balance = 0;
		
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
		
		public void transferFrom(Account account, double amount) {
		    account.withdraw(amount);
		    this.deposit(amount);
		  }

		
	}
	
		
		


