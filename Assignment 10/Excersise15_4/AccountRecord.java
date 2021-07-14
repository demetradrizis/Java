public class AccountRecord
{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // initializes an Account with default values
    public AccountRecord()
    {
        this(0, "", "", 0.0); // call other constructor
    }

    // initializes an Account with provided values
    public AccountRecord(int acct, String first,
                   String last, double bal)
    {
        this.account = acct;
        this.firstName = first;
        this.lastName = last;
        this.balance = bal;
    }

    // set account number
    public void setAccount(int acct)
    {
        account = acct;
    }
   
    //get account number
    public int getAccount()
    {
        return account;
    }
    
    // set first name
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    // get first name
    public String getFirstName()
    {
        return firstName;
    }

    // set last name
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    // get last name
    public String getLastName()
    {
        return lastName;
    }

    // set balance
    public void setBalance(double bal)
    {
        balance = bal;
    }
    
    // get balance
    public double getBalance()
    {
        return balance;
    }

    //combine transaction amount and current account balance
    public void combine(TransactionRecord transaction)
    { 
    	balance = balance + transaction.getAmount(); 
    }
}
