/*
 * Demetra Drizis 
 * Assignment 6
 */
public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   // four-argument constructor
   public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
      double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber); // pass to Employee constructor
      if(weeklySalary < 0.0)
      {
          throw new IllegalArgumentException("Weekly salary must be >= 0.0");
      }
      this.weeklySalary = weeklySalary;  // validate and store salary
   } // end four-argument SalariedEmployee constructor

   // set salary
   public void setWeeklySalary( double weeklysalary )
   {
      if(weeklySalary <0.0)
      {
          throw new IllegalArgumentException("Weekly salary must be >= 0.0");
      }
      this.weeklySalary = weeklySalary;
   } // end method setWeeklySalary

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } // end method getWeeklySalary

   // calculate earnings; override abstract method earnings in Employee
  @Override
   public double earnings()
   {
      return getWeeklySalary();
   } // end method earnings

   // return String representation of SalariedEmployee object

  public String toString()
   {
      return String.format( "Salaried Employee: %s%n%s: $%,.2f", 
         super.toString(), "Weekly Salary", getWeeklySalary() );
   } // end method toString
} // end class SalariedEmployee
