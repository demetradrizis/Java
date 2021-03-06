import java.io.File;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMatch 
{
  private static Scanner inOldMaster;
  private static Scanner inTransaction; 
  private static Formatter outNewMaster;
  private static Formatter logFile; 
  private static TransactionRecord transaction; 
  private static AccountRecord account; 
  
  public FileMatch()
  {
	  transaction = new TransactionRecord(); 
	  account = new AccountRecord(); 
  }
  
  public void openFiles()
  {
	  try
	  {
		  inOldMaster = new Scanner (new File ("oldmast.txt"));
		  inTransaction = new Scanner (new File ("trans.txt"));
		  outNewMaster = new Formatter ("newmast.txt");
		  logFile = new Formatter ("log.txt");
	  }
	  
	  catch (Exception exception)
	  {
		  System.err.println("Error opening files.");
	  }
  }
  
  public void processFiles()
  {
	  int transactionAccountNumber;
	  int accountNumber; 
	  
	  try
	  {
		  transaction = getTransactionRecord(); 
		  
		  if (transaction == null)
		  {
			  return; 
		  }
		  
		  transactionAccountNumber = transaction.getAccount(); 
		  account = getAccountRecord(); 
		  
		  if (account == null)
		  {
			  return; 
		  }
		  
		  accountNumber = account.getAccount(); 
		  
		  while (accountNumber != 0)
		  {
			  while (accountNumber < transactionAccountNumber)
			  {
				  outNewMaster.format("%d %s %s %.2f\n", account.getAccount(),
						  account.getFirstName(), account.getLastName(), account.getBalance());
				  
				  account = getAccountRecord(); 
				  
				  if (account == null)
				  {
					  return; 
				  }
				  
				  accountNumber = account.getAccount(); 
			  }
			  
			  if (accountNumber == transactionAccountNumber)
			  {
				  account.combine(transaction);
				  outNewMaster.format("%d %s %s %.2f\n", account.getAccount(),
						  account.getFirstName(), account.getLastName(), account.getBalance());
				  
				  transaction = getTransactionRecord(); 
				  
				  if (transaction == null)
				  {
					  return; 
				  }
				  
				  transactionAccountNumber = transaction.getAccount();
				  
				  account = getAccountRecord(); 
				  
				  if (account == null)
				  {
					  return; 
				  }
				  
				  accountNumber = account.getAccount(); 
			  }
			  
			  while (transactionAccountNumber < accountNumber)
			  {
				  logFile.format("%s %d\n", "Unmatched transaction record or account number",
						  transactionAccountNumber);
				  
				  transaction = getTransactionRecord();
				  
				  if (transaction == null)
				  {
					  return; 
				  }
				  
				  transactionAccountNumber = transaction.getAccount();
			  }
		  }
	  }
	  
	  catch (FormatterClosedException closedException)
	  {
		  System.err.println("Error writing to file, file closed.");
		  System.exit(1);
	  }
	  
	  catch (IllegalFormatException formatException)
	  {
		  System.err.println("Error with output.");
		  System.exit(1);
	  }
	  
  }
  
  public void closeFiles()
  {
	  try
	  {
		  if(inTransaction != null)
		  {
			  inTransaction.close();
		  }
		  
		  if (outNewMaster != null)
		  {
			  outNewMaster.close();
		  }
		  
		  if (inOldMaster != null)
		  {
			  inOldMaster.close();
		  }
		  
		  if (logFile != null)
		  {
			  logFile.close();
		  } 
	  }
	  
	  catch (Exception exception)
	  {
		  System.err.println("Error closing the files.");
		  System.exit(1);
	  }
  }
  private TransactionRecord getTransactionRecord()
  {
	  try
	  {
		  if (inTransaction.hasNext())
		  {
			  transaction.setAccount(inTransaction.nextInt());
			  transaction.setAmount(inTransaction.nextDouble());
			  return transaction; 
		  }
		  else
		  {
			  while (inOldMaster.hasNext())
			  {
				  account.setAccount(inOldMaster.nextInt());
				  account.setFirstName(inOldMaster.next());
				  account.setLastName(inOldMaster.next());
				  account.setBalance(inOldMaster.nextDouble());
				  
				  outNewMaster.format("%d %s %s %.2f\n", account.getAccount(), 
						  account.getFirstName(), account.getLastName(), account.getBalance());
						  
			  }
		  }
	  }
	  
	  catch (FormatterClosedException closedException)
	  {
		  System.err.println("Error writing to file, file closed.");
		  System.exit(1);
	  }
	  
	  catch (IllegalFormatException formatException)
	  {
		  System.err.println("Error with output.");
		  System.exit(1);
	  }
	  
	  catch (NoSuchElementException elementException)
	  {
		  System.err.println("Invalid input from file.");
		  System.exit(1);
	  }
	  
	  return null;
  }
  
  private AccountRecord getAccountRecord()
  {
	  try
	  {
		  if (inOldMaster.hasNext())
		  {
			  account.setAccount(inOldMaster.nextInt());
			  account.setFirstName(inOldMaster.next());
			  account.setLastName(inOldMaster.next());
			  account.setBalance(inOldMaster.nextDouble());
			  return account;
		  }
		  else
		  {
			  logFile.format("%s %d\n", "Unmatched transaction record for account number",
					  transaction.getAccount());
			  
			  while (inTransaction.hasNext())
			  {
				  transaction.setAccount(inTransaction.nextInt());
				  transaction.setAmount(inTransaction.nextDouble());  
			  }
		  }
	  }
	  
	  catch (FormatterClosedException closedException)
	  {
		  System.err.println("Error writing to file, file closed.");
		  System.exit(1);
	  }
	  
	  catch (IllegalFormatException formatException)
	  {
		  System.err.println("Error with output.");
		  System.exit(1);
	  }
	  
	  catch (NoSuchElementException elementException)
	  {
		  System.err.println("Invalid input from file.");
		  System.exit(1);
	  }
	  
	  return null; 
  }

}

