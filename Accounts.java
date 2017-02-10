/**
 * Created by johnlinde on 11/7/16.
 */
public class Accounts {

    /*
        Object identifying variables.
     */

    private static int serialNo = 10000;

    private String description;
    private double amount;

    /*
        Class level variables keeping track of each of the Company's accounts.
     */

    public static double stockholdersEquity;
    public static double totalAssets;
    public static double totalLiabilities;
    public static double estimateSE;

    public static double totalRevenue;
    public static double totalExpenses;
    public static double totalIncome;

    public static double accountsPayable;
    public static double accountsReceivable;
    public static double cash;
    public static double stock;
    public static double notesPayable;
    public static double prepaidRent;
    public static double rentExpense;
    public static double wagesExpense;
    public static double revenue;
    public static double supplies;
    public static double suppliesExpense;
    public static double operatingExpense;
    public static double unearnedRevenue;
    public static double equipment;

    /*
        Constructs a new object of Accounts class with serialNo, description and amount.
     */

    public Accounts(String thisDescription, double thisAmount)
    {;
        description = thisDescription;
        amount = thisAmount;
        serialNo = serialNo;
        serialNo++;
    }

    public String getAccounts()
    {
        return String.format("%d %s %.2f",
                serialNo, description, amount);
    }

    /*
        Methods for crediting and debiting as well as whether that means an entry to the left or
         right side of the T-Account (add or subtract thisAmount). Also methods for
         getting values.
     */

    public double creditEquipment(double thisAmount)
    {
        equipment -= thisAmount;
        return equipment;
    }

    public double debitEquipment(double thisAmount)
    {
        equipment += thisAmount;
        return equipment;
    }

    public double creditUnearnedRevenue(double thisAmount)
    {
        unearnedRevenue += thisAmount;
        return unearnedRevenue;
    }

    public double debitUnearnedRevenue(double thisAmount)
    {
        unearnedRevenue -= thisAmount;
        return unearnedRevenue;
    }

    public double creditSuppliesExpense(double thisAmount)
    {
        suppliesExpense -= thisAmount;
        return suppliesExpense;
    }

    public double debitSuppliesExpense(double thisAmount)
    {
        suppliesExpense += thisAmount;
        return suppliesExpense;
    }

    public double creditOperatingExpense(double thisAmount)
    {
        operatingExpense -= thisAmount;
        return operatingExpense;
    }

    public double debitOperatingExpense(double thisAmount)
    {
        operatingExpense += thisAmount;
        return operatingExpense;
    }

    public double creditSupplies(double thisAmount)
    {
        supplies -= thisAmount;
        return supplies;
    }

    public double debitSupplies(double thisAmount)
    {
        supplies += thisAmount;
        return supplies;
    }

    public double creditRevenue(double thisAmount)
    {
        revenue += thisAmount;
        return revenue;
    }

    public double debitRevenue(double thisAmount)
    {
        revenue -= thisAmount;
        return revenue;
    }

    public double creditWagesExpense(double thisAmount)
    {
        wagesExpense -= thisAmount;
        return wagesExpense;
    }

    public double debitWagesExpense(double thisAmount)
    {
        wagesExpense += thisAmount;
        return wagesExpense;
    }

    public double creditRentExpense(double thisAmount)
    {
        rentExpense -= thisAmount;
        return rentExpense;
    }

    public double debitRentExpense(double thisAmount)
    {
        rentExpense += thisAmount;
        return rentExpense;
    }

    public double creditPrepaidRent(double thisAmount)
    {
        prepaidRent -= thisAmount;
        return prepaidRent;
    }

    public double debitPrepaidRent(double thisAmount)
    {
        prepaidRent += thisAmount;
        return prepaidRent;
    }

    public double creditNotesPayable(double thisAmount)
    {
        notesPayable += thisAmount;
        return notesPayable;
    }

    public double debitNotePayable(double thisAmount)
    {
        notesPayable -= thisAmount;
        return notesPayable;
    }

    public double creditStock(double thisAmount)
    {
        stock += thisAmount;
        return stock;
    }

    public double debitStock(double thisAmount)
    {
        stock -= thisAmount;
        return stock;
    }

    public double creditCash(double thisAmount)
    {
        cash -= thisAmount;
        return cash;
    }

    public double debitCash(double thisAmount)
    {
        cash += thisAmount;
        return cash;
    }

    public double debitAccountsReceivable(double thisAmount)
    {
        accountsReceivable += thisAmount;
        return accountsReceivable;
    }

    public double creditAccountsReceivable(double thisAmount)
    {
        accountsReceivable -= thisAmount;
        return accountsReceivable;
    }

    public double creditAccountsPayable(double thisAmount)
    {
        accountsPayable += thisAmount;
        return accountsPayable;
    }

    public double debitAccountsPayable(double thisAmount)
    {
        accountsPayable -= thisAmount;
        return accountsPayable;
    }

    public String getDescription()
    {
        return description;
    }

    public int getSerialNo()
    {
        return serialNo;
    }

    /*
        Remaining code is to update our variables that will be called in another class to
        update the DB and methods to print the IncomeStatement and BalanceSheet as well as verify
        accounting identities not violated..
     */

    public void updateIncomeStatement()
    {
        totalRevenue = revenue;
        totalExpenses = wagesExpense + rentExpense + suppliesExpense;
        totalIncome = totalRevenue - totalExpenses;
    }

    public void updateBalanceSheet()
    {
        totalAssets = accountsReceivable + cash + prepaidRent + supplies + equipment;
        totalLiabilities = accountsPayable + notesPayable + unearnedRevenue;
        stockholdersEquity = stock;
        double estimateSE = stock - rentExpense - wagesExpense - suppliesExpense- operatingExpense;
    }

    public double getEstimateSE()
    {
        return estimateSE;
    }

    public double getTotalStockEquity()
    {
        return stockholdersEquity;
    }

    public double getTotalLiabilities()
    {
        return totalLiabilities;
    }

    public double getTotalAssets()
    {
        return totalAssets;
    }

}
