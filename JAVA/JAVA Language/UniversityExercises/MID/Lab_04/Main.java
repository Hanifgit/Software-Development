package Lab_04;

public class Main {
	public static void main(String[] args) {
		Account objAccount1 = new Account();
		Account objAccount2 = new Account(2,100000);
		
		objAccount2.Print();
		
		objAccount1.setId(1);
		objAccount1.setBalance(500000);
		objAccount1.setAnnualInterestRate(100);
		
		System.out.println(objAccount1.getId());
		System.out.println(objAccount1.getBalance());
		System.out.println(objAccount1.getAnnualInterestRate());
		
		System.out.println("Deposit Add: "+objAccount1.deposit());
		System.out.println("Withdraw: "+objAccount1.withdraw());
		System.out.println(objAccount1.getMonthlyInterest());
		System.out.println(objAccount1.getMonthlyInterestRate());
	}
}
