package roughArea;

import java.util.Scanner;

public class BankingServices extends Bank {
	
protected int ATMWithDrawal(int debited,int balance) 
{
		balance=balance-debited;
		return balance;
}

protected int CashDeposit(int credited,int balance) 
{
		balance=balance+credited;
		return balance;
	
}

	public void options() {
	
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		do {
			System.out.println("Enter the option as 1.ATM Withdrawal 2.Cash Deposit 3.Account Transfer 4.Exit");
			a = sc.nextInt();
			
			switch(a)
			{
			case 1:
				
				
		
				
				
				break;
			case 2:
				
				
				break;
			case 3:
				
				
				break;
			
					
			}}
	
		while(a!=4);
		{
		System.out.println("Session LOGGED-OUT Successfully");	
	}
			
	}
	}