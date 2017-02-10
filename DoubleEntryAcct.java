import java.util.Scanner;

/**
 * Created by johnlinde on 11/7/16.
 */
public class DoubleEntryAcct
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);


        boolean done = false;
        while(!done)
        {
            System.out.println("I) Initialize database A) Add Entry P) Print Q) Quit");
            String userInput = in.nextLine().toUpperCase();
            if (userInput.equals("I"))
            {
               System.out.println("Enter Y) Yes to confirm Initialization (Any other button to quit): ");
               String answer = in.nextLine();
                if (answer.equalsIgnoreCase("Y"))
                {
                    System.out.println("Enter assets: ");
                    double assets = in.nextDouble();
                    System.out.println("Enter liabilities: ");
                    double liabilities = in.nextDouble();
                    double stockEquity = assets - liabilities;
                    /*
                    To do call correct methods to print I/S and B/S
                     */
                }
                else
                {
                    done = true;
                }
            }
            else if(userInput.equals("A"))
            {
                System.out.print("R) Record sale P) Pay out I) Inventory, supplies, and equipment S) Stock E) Expenses Q) Quit: ");
                String answer = in.nextLine();
                if (answer.equalsIgnoreCase("R"))
                {
                    System.out.println("Enter if sold T) Today or F) Future? (Any other button to quit): ");
                    String userAnswer = in.nextLine();
                    if (userAnswer.equalsIgnoreCase("T")) {
                        System.out.println("Enter total sale amount: ");
                        double totalSale = in.nextDouble();
                        System.out.println("Enter cash collected: ");
                        double cashCollect = in.nextDouble();
                        System.out.println("Enter A/R: ");
                        double accountsReceivable = in.nextDouble();

                        /*
                        To do create Accounts object and call
                        correct debits and credits
                        */
                    }
                    else if (userAnswer.equalsIgnoreCase("F")) {
                        System.out.println("Enter future sale amount: ");
                        double futureSale = in.nextDouble();

                        /*
                            To do methods on futureSale variable.
                         */
                    }
                    else if (userAnswer.equalsIgnoreCase(""))
                    {

                    }
                }
                else if(answer.equalsIgnoreCase("Q"))
                {
                    done = true;
                }

            }
            else if (userInput.equals("P"))
            {
                //To do call arrayList class Account Entries and call print method.
            }
            else if (userInput.equals("Q"))
            {
                done = true;
            }
        }

    }
}
