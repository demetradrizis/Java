// Fig. 15.10: Transactions.java
// Maintains a List<Account>
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Transactions
{
           // @XmlElement specifies XML element name for each object in the List
           @XmlElement(name="TransactionRecord")
           private List<TransactionRecord> transactions = new ArrayList<>(); // sto$

           // returns the List<TransactionRecord>
           public List<TransactionRecord> getTransactions() {return transactions;}
}
