package assignment;

import java.util.Scanner;

public class BankAccount {
	Scanner sc = new Scanner(System.in);
	
	//fields
	int accountNo;
	String holderName;
	String pinNo;
	String password;
	
	int balance = 10000;
	
	//constructor
	//argument constructor
	public BankAccount(int accountNo, String holderName, String pinNo, String password) {
		this.accountNo  = accountNo;
		this.holderName = holderName;
		this.pinNo		= pinNo;
		this.password	= password;
	}
	
	//methods
	//deposit
	public void deposit(int depositAmount) {
		this.balance = balance + depositAmount;
		System.out.println("Total: " + balance);
	}
	
	//withdraw
	public void withdraw(int withdrawAmount) throws InsufficientAmountExeption {
		if(withdrawAmount <= this.balance){
			int currentAmount = this.balance-withdrawAmount;
			System.out.println("Successfully withdrawed: " + withdrawAmount + "Total: " + currentAmount);
		}else {
			throw new InsufficientAmountExeption("Your balance is not enough!");
		}
	}
	
	//password
	public boolean changePassword(String inputPin){
		boolean pinNo = true;
		boolean changepassword = false;
		while(!this.pinNo.equals(inputPin)) {
			System.out.println("Incorrect Pin Number!");
		}
		if(this.pinNo.equals(inputPin)) {
			System.out.println("Enter your new password: ");
			String pw1 = sc.next();
			System.out.println("Enter your password again: ");
			String pw2 = sc.next();
			if(pw1 == pw2) {
				this.password= pw1;
				System.out.println("Password changed successfully!");
				changepassword = true;
			}else {
				System.out.println("Passwords didn't match!");
			}	
		}
		return pinNo;
	}
	
	//show info
	public void showinfo(){
		System.out.println("Account Number: " + this.accountNo);
		System.out.println("Holder Name: " + this.holderName);
		System.out.println("Pin Number: " + this.pinNo);
		System.out.println("Balabnce: " + this.balance);
	}
	
}
