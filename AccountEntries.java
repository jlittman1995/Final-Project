/**
 * Created by johnlinde on 11/7/16.
 */
import java.util.ArrayList;


public class AccountEntries {

    private ArrayList <Accounts> accountEntries;
    private int listCount;

    public AccountEntries()
    {
        accountEntries = new ArrayList <Accounts>();
    }

    public void addAccountEntry(Accounts thisAccount)
    {
        accountEntries.add(thisAccount);
        listCount++;
    }

    public void removeAccountEntry(Accounts thisAccount)
    {
        accountEntries.remove(thisAccount);
        listCount--;
    }

    public String entriesToString()
    {
        StringBuffer sb = new StringBuffer();
        for (Accounts thisAccount : accountEntries)
        {
            sb.append(thisAccount.getAccounts());
            sb.append('\n');
        }
        return sb.toString();

    }


}
