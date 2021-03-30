package Lab_04;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {
		System.out.println("No Parameter Account");
	}
	
	public Account(int id,double balance) {
		this.id = id;
		if(balance<=0) System.out.println("Balance less then zero");
		else this.balance = balance;
	}
	
	public void Print() {
		System.out.println(id);
		System.out.println(balance);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
		
		//annualInterestRate/360
	}
	
	public double getMonthlyInterest() {
		//return (annualInterestRate/360)*30;
		return (balance*(annualInterestRate/100))/12;
		//double x = annualInterestRate/100;
		//return x/12;
	}
	
	public double withdraw() {
		//return 5000.10;
		double  withdraw = 5000.10;
		if(balance<withdraw) {
			System.out.println("Not withdraw");
			return 0;
		}
		return balance = balance - withdraw;
	}
	
	public double deposit() {
		return balance = balance + 1000200.50;
	}
	
}
