/*
 * Name:		Greg Froning
 * Date:		6/7/2014
 * Description: Has interface for creating accounts, and methods for the bank account class.
 */
import java.util.Scanner;


public class Week4Project {

	public static void main(String[] args) 
	{	
		BankAccount[] theAccounts = new BankAccount[15];
		theAccounts[0] = Start();
		
		System.out.println(theAccounts[0].accntName());
	}
	
	public static BankAccount Start()
	{
		Scanner input = new Scanner( System.in );
		int selection;
		String string;

		System.out.println("[0]Create New Account");
		System.out.println("[1]Delete Account");
		System.out.println("[2]View Account Info");
		System.out.println("[3]Make Deposit");
		System.out.println("[4]Make Withdrawal");
		System.out.println("[5]Exit Program");
		System.out.println("Enter A Selection");
		
		selection = input.nextInt();
		
		switch (selection)
		{
			case 0:
				System.out.println("Enter A Name");
				string = input.next();
				
				BankAccount Account = new BankAccount("0", string);
				Start();
				return Account;
				
			case 1:
				System.out.println("Enter An Account Number");
				string = input.next();
				System.out.println("Account Deleted");
				Start();
				break;
				
			case 2:
				System.out.println("Enter An Account Number");
				string = input.next();
				System.out.println("Account Information");
				Start();
				break;
				
			case 3:
				System.out.println("Enter An Account Number");
				string = input.next();
				System.out.println("Enter An Amount To Deposit");
				string = input.next();
				Start();
				break;
				
			case 4:
				System.out.println("Enter An Account Number");
				string = input.next();
				System.out.println("Enter An Amount To Withdraw");
				string = input.next();
				Start();
				break;
				
			case 5:
				System.exit(0);
				break;
		}
		return null;
	}

}
