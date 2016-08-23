package ssa;

public class Mainline5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account5 checking = new Account5();
		checking.accountId   = 100;
		checking.description = "My personal checking account";
		checking.balance     = 500;
		checking.getDetails();
		checking.deposit(200);
		checking.getDetails();
		checking.withdraw(600);
		checking.getDetails();
		checking.deposit(100);
		checking.withdraw(300);
		checking.getDetails();
		checking.withdraw(200);
		checking.getDetails();
		
		Account5 savings     = new Account5();
		savings.accountId   = 200;
		savings.description = "My personal savings account";
		savings.balance     = 1000;
		savings.getDetails();
		savings.withdraw(750);
		savings.getDetails();
		savings.withdraw(250);
		savings.getDetails();
		savings.deposit(200);
		savings.getDetails();
		
		checking.getDetails();
		
		 
		
		
	}

}
