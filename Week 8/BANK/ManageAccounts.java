/* Creates BankAccount objects and tests methods 
 * of the BankAccount class
*/

public class ManageAccounts 
{
   public static void main(String[] args)
   {
    //create account1 for Sam with $1000
    BankAccount account1 = new BankAccount("Sam",1000);
    
    //create account2 for Anders with $500
    BankAccount account2 = new BankAccount("Anders",500);                                      
    
    //deposit $100 to Anders' account
    account2.deposit(100);

    //print Anders' new balance (use getBalance())
    System.out.println("Anders' new balance is " + account2.getBalance());                                 

    //withdraw $50 from Sam's account
    account1.withdrawal(50);                                         

    //print Sam's new balance (use getBalance())
    System.out.println("Sam's new balance is " + account1.getBalance());                                 
                                      
    //print the name on either acct (use getName())
    System.out.println("Name on account2 is " + account2.getName());                                 
                                         
    //print summary for both accounts (use toString())
    System.out.println(account1.toString());                                 
    System.out.println(account2.toString());  
   }
}