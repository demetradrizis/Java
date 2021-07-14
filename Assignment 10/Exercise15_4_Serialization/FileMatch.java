import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.bind.JAXB;
import java.util.List;

public class FileMatch {
    public static void main(String[] args) {
        Accounts oldAccounts = null;
        Transactions transactions = null;
        Accounts newAccounts = new Accounts();
        
        try(BufferedReader oldmast = 
	    Files.newBufferedReader(Paths.get("oldmast.xml"))) {
            oldAccounts = JAXB.unmarshal(oldmast, Accounts.class);
        }
        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
        try(BufferedReader trans = 
	    Files.newBufferedReader(Paths.get("trans.xml"))) {
	    transactions = JAXB.unmarshal(trans, Transactions.class);
        }
        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
        try(BufferedWriter newmast = Files.newBufferedWriter(Paths.get("newmast.xml"))) {
            for (Account account : oldAccounts.getAccounts()) {
                int acctNo = account.getAccountNumber();
                for (TransactionRecord transaction : transactions.getTransactions()) {
                    int transAcctNo = transaction.getAccount();
                    if (acctNo == transAcctNo) {
                        double amount = account.getBalance() + transaction.getAmount();
                        account.setBalance(amount);
                    } 
                }
                newAccounts.getAccounts().add(account);
	    }
	    JAXB.marshal(newAccounts, newmast);
        }
        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
    }
}

