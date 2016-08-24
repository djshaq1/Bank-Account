package ssa;

public class Savings extends Account {
	
private double InterestRate = 0.015;
private double minimumBalance = 10;





void CalcDepositInterest(int months) {
	double monthlyInterestRate = 0;
	monthlyInterestRate = InterestRate / 12 ;
	 double money = (monthlyInterestRate * months);
	 if (getBalance() > minimumBalance)
	 deposit(money * (getBalance()));
}


public double getInterestRate() {
	return InterestRate;
}

public void setInterestRate(double interestRate) {
	InterestRate = interestRate;
}
public double getMinimumBalance() {
	return minimumBalance;
}
public void setMinimumBalance(double minimumBalance) {
	this.minimumBalance = minimumBalance;

}


}
