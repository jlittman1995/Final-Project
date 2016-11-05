import java.util.ArrayList;


public class AccountEntry {
	
	private ArrayList <Account> accountEntries;
	private int listCount;
	
	public AccountEntry()
	{
		accountEntries = new ArrayList <Account>();
	}
	
	public void addAccountEntry(Account thisAccount)
	{
		accountEntries.add(thisAccount);
		listCount++;
	}
	
	public void removeAccountEntry(Account thisAccount)
	{
		accountEntries.remove(thisAccount);
		listCount--;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for (Account thisAccount : accountEntries)
		{
			sb.append(thisAccount.toString());
			sb.append('\n');
		}
		return sb.toString();
		
	}
	

}
