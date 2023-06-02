package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Is there an initial deposit? (y/n): ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y')
		{
			System.out.println("Enter initial deposit value: ");
			double ballance = sc.nextDouble();
			account = new Account(name, number, ballance);
		}
		else
		{
			account = new Account(name, number);
		}
		
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.Deposit(deposit);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println("");
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.Withdraw(withdraw);
		
		System.out.println("");
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		sc.close();
	}

}
