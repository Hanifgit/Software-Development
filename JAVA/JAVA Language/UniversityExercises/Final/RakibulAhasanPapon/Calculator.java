package RakibulAhasanPapon;

public class Calculator {

	public double adding(double balance, double deposit){
		return balance += deposit;
	}

	public double subtracting(double balance, double withdraw) {
		return balance -= withdraw;
	}

	public double multiplying(double interestRate, double timePeriod) {
		return interestRate * timePeriod;
	}

	public double dividing(double num, double num1) {
		return num/num;
	}
}
