/*
 * Demetra Drizis 
 * Assignment 6
 */

public class PieceworkerEmployee extends Employee{

    private double wage; 		//store wage per piece
    private int pieces; 		//stores number of pieces produced
 
public PieceworkerEmployee(String firstName, String lastName, String socialSecurityNumber,
     double wage, int pieces)
   {
     super(firstName, lastName, socialSecurityNumber);
     
     this.wage = wage; 
     this.pieces = pieces; 
     
   }// end five-argument PieceworkerEmployee constructor

   //sets wages 
    public void setWages(double wages)
    {
    	if (wage > 0.0)
    		wage = wage; 
    	else 
    		wage = 0.0; 
       // wage = (wage > 0.0) ? wages:0.0;
    }

    // gets wages  
    public double getWages()
    {
        return wage;
    }

// sets number of pieces produced 
    public void setPieces(int piece)
    {
        if (pieces < 0)
        	pieces = pieces; 
        else
        	pieces = 0; 
    	//pieces = (pieces < 0) ? 0:pieces;
    }
// returns number of pieces
    public int getPieces()
    {
        return pieces;
    }
// calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings()
    {
        return getWages() * getPieces();
    }

// return String representation of PieceworkerEmployee object

    public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %,d",
         "Piece worker",super.toString(), "Wage per piece", getWages(),
         "Pieces produced", getPieces() );
   }// end of toString method
}// end of the PieceworkerEmployee class
