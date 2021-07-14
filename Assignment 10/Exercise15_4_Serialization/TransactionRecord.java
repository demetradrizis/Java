import java.io.Serializable;

public class TransactionRecord implements Serializable
{
    private int account;
    private double amount;

    public TransactionRecord()
    {
        this (0, 0.0);
    }

    public TransactionRecord(int acct, double amt)
    {
        this.account = acct;
        this.amount = amt;
    }

    public void setAccount(int acct)
    {
       account = acct;
    }
    public int getAccount()
    {
        return account;
    }

    public void setAmount(double amt)
    {
        amount = amt;
    }
    public double getAmount()
    {
        return amount;
    }
}


