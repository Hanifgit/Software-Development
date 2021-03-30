package RakibulAhasanPapon;

import java.util.Scanner;
//"Rakibul Ahasan Papon ,ID- 022", 10000, 20
public class Main {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner input = null;
		while (flag) {
			try {
				input = new Scanner(System.in);
				System.out.println();
				System.out.print("Enter Your Information: ");
				String myINFO = input.nextLine();
				System.out.print("Enter Your Account Balance: ");
				double balance = input.nextDouble();
				System.out.print("Enter InterestRate: ");
				double interestRate = input.nextDouble();
				Account objAccount = new Account(myINFO, balance, interestRate);

				System.out.print("Enter withDraw: ");
				double withDraw = input.nextDouble();
				System.out.print("Enter Deposit: ");
				double Deposit = input.nextDouble();
				System.out.print("Enter Time Period: ");
				int Rate = input.nextInt();

				System.out.print("\nYour Information: ");
				System.out.println(myINFO);
				System.out.print("After withDraw of your balance: ");
				objAccount.withdraw(withDraw);
				System.out.print("After Deposit of your balance: ");
				objAccount.deposit(Deposit);
				System.out.print("Interest: ");
				objAccount.calculateInterest(Rate);
				//flag = false;
				//throw new MyException("Another INPUT :- ");

			}catch (MyException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.err.println(e);
				System.out.println("INVALID INPUT!!");
			    e.printStackTrace();
			}finally {
				System.out.println("finally block is always executed");
			}
		}
		input.close();
	}
}
