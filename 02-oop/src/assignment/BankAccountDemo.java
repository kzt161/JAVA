package assignment;

import java.util.Scanner;

public class BankAccountDemo {
	
	public static void main(String[] args) {
		int accNo = 162;
		String userName = "hAi";
		String userPin = "16103";
		String userPass = "futon";
		
		Scanner sc = new Scanner(System.in);
		boolean program = true;
		
		try {
			BankAccount bankacc1 = new BankAccount(accNo, userName, userPin, userPass);
			
			String password = bankacc1.password;
			
			System.out.println("Enter password: ");
			String inputPass = sc.next();
			
			while(!password.equals(inputPass)){
				System.out.println("Incorrect Pasword!");
			}
			
			System.out.println("Password correct!");
			
			
			while(program) {
				System.out.println("1. DEPOSIT");
				System.out.println("2. WITHDRAW");
				System.out.println("3. CHANGE PASSWORD");
				System.out.println("4. ACCOUNT INFORMATION");
				System.out.println("5. EXIT");
				
				boolean inputNumber = false;
				
				while(!inputNumber) {
					System.out.println("Choose your option: ");
					while(sc.hasNext("[a-zA-Z]+")) {
						System.out.println("Out of option!");
						sc.next();
					}
					
					int num = sc.nextInt();
					
					if(num >=1 && num <=4) {
						System.out.println("------");
					}
					switch(num) {
					case 1: {
						System.out.println("---DEPOSIT---");
						System.out.println("Enter Deposit Amount: ");
						int depositAmount = sc.nextInt();
						bankacc1.deposit(depositAmount);
						inputNumber = true;
						break;
					}
					case 2: {
						System.out.println("---WITHDRAW---");
						System.out.println("Enter Withdraw Amount: ");
						int withdrawAmount = sc.nextInt();
						bankacc1.withdraw(withdrawAmount);
						inputNumber = true;
						break;
					}
					case 3: {
						System.out.println("---CHANGE PASSWORD---");
						System.out.print("Enter your Pin Number: ");
						String inputPin = sc.next();
						boolean pinStatus = bankacc1.changePassword(inputPin);
						inputNumber = true;
						if(!pinStatus) {
							return;
						}
						break;
					}
					case 4: {
						System.out.println("---Account Information---");
						bankacc1.showinfo();
						inputNumber = true;
						break;
						}
					case 5: {
						System.out.println("EXIT");
						inputNumber = true;
						program = false;
						return;
					}
					default: {
						System.err.println("Input Number error!");
					}
					}
				}
			}
		}
		catch(InsufficientAmountExeption e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("----------");
		}
	}
}
