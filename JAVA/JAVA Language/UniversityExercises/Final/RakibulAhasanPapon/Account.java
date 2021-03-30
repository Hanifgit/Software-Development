package RakibulAhasanPapon;

public class Account extends Calculator {
	String personINFO;
	double balance;
	double interestRate;

	public Account(String personINFO, double balance, double interestRate) {
		this.personINFO = personINFO;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void withdraw(double withDraw){
		try {
			if(withDraw>balance) 
				throw new MyException("Withdraw more then current balance!!\n");
			else {
				double Ans = super.subtracting(balance, withDraw);
				System.out.println(Ans);
				balance = Ans;
			}
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void deposit(double Deposit) throws MyException {
		if (Deposit <= 0) {
			throw new MyException("Deposit is not possible negative!!\n");
		}else {
			double Ans = super.adding(balance, Deposit);
			System.out.println(Ans);
			balance = Ans;
		}
	}

	public void calculateInterest(int time) {
		try {
			if(time<0)
				throw new Exception("Basically Time is not possible negative!!");
			double rt = super.multiplying(interestRate / 100.0, time);
			rt += 1;
			double interest = super.multiplying(balance, rt);
			System.out.println(interest);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
