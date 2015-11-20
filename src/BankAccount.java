
public class BankAccount 
{
	private String AccountNumber;
	public String AccountHolderName;
	private float CurrentBalance;
	
	public BankAccount( String accNum, String accName )
	{
		CurrentBalance = 0;
		
		AccountNumber = accNum;
		AccountHolderName = accName;
	}
	
	public String accntName()
	{
		return AccountHolderName;
	}
	
	public String Deposit( float amnt )
	{
		if ( amnt > 0 )
		{
			CurrentBalance += amnt;
			return "Deposit Successful";
		}
		else
		{
			return "Invalid Amount";
		}
	}
	
	public String Withdrawal( float amnt )
	{
		if (amnt > 0 )
		{
			CurrentBalance -= amnt;
			return "Withdrawal Successful";
		}
		else
		{
			return "Invalid Amount";
		}
		
	}

}
