/*
 * Demetra Drizis 
 * Assignment 6
 */
public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary, Date birthDate)
   {
      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthDate);
      if(baseSalary < 0.0 )//validate base salary per week
      {
          throw new IllegalArgumentException("Base salary must be >= 0.0");
      }
      this.baseSalary = baseSalary; // validate and store base salary
   } // end six-argument BasePlusCommissionEmployee constructor

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
	   if(baseSalary < 0.0 )
	   {
           throw new IllegalArgumentException("Base salary must be >= 0.0");
	   }
       this.baseSalary = baseSalary;// non-negative
   } // end method setBaseSalary

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary

   // calculate earnings; override method earnings in CommissionEmployee
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } // end method earnings

   // return String representation of BasePlusCommissionEmployee object
 
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f", 
         "Base-salaried", super.toString(), 
         "Base salary", getBaseSalary() );
   } // end method toString   
} // end class BasePlusCommissionEmployee

