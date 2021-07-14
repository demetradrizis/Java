import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import javax.xml.bind.JAXB;

public class CreateTestData
{

        public static void main(String args[])
        {
                try(BufferedWriter output = Files.newBufferedWriter(Paths.get("oldmast.xml")))
                {
                        Accounts accounts = new Accounts();

                        Account record = new Account(100, "Alan", "Jones", 348.17);
                        Account record1 = new Account(300, "Mary", "Smith", 27.19);
                        Account record2 = new Account(500, "Sam", "Sharp", 0.00);
                        Account record3 = new Account(700, "Suzy", "Green", -14.22);


                        accounts.getAccounts().add(record);
                        accounts.getAccounts().add(record1);
                        accounts.getAccounts().add(record2);
                        accounts.getAccounts().add(record3);

                        JAXB.marshal(accounts, output);

                }
                catch (IOException io)
                {
                        System.err.println("Error opening the file.");
                }

 try(BufferedWriter output = Files.newBufferedWriter(Paths.get("trans.xml")))
                {
                        Transactions transactions = new Transactions();

                        TransactionRecord trans = new TransactionRecord(100, 27.14);
                        TransactionRecord trans1 = new TransactionRecord(300, 62.11);
                        TransactionRecord trans2 = new TransactionRecord(400, 100.56);
                        TransactionRecord trans3 = new TransactionRecord(900, 82.17);

                        transactions.getTransactions().add(trans);
                        transactions.getTransactions().add(trans1);
                        transactions.getTransactions().add(trans2);
                        transactions.getTransactions().add(trans3);

                        JAXB.marshal(transactions, output);
                }
                catch (IOException io)
                {
                        System.out.println("Error reading or writing to the file.");
                        System.exit(1);
                }
        }
}

