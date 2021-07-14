/*
 * Demetra Drizis 
 * Assignment 6
 */
public class CommissionEmployee extends Employee 
{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
      double grossSales, double commissionRate, Date birthDate)
   {
      super(firstName, lastName, socialSecurityNumber, birthDate);
      if(commissionRate <= 0.0 || commissionRate >= 1.0)//validate commission rate
      {
          throw new IllegalArgumentException("Commission rate must be > 0.0 and <1.0");
      }

      if(grossSales < 0.0)//validate gross sales
      {
          throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }
      
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end five-argument CommissionEmployee constructor

   public void setGrossSales(double grossSales)
   {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
   }

   public double getGrossSales()
   {
        return grossSales;
   }

   public void setCommissionRate(double commissionRate)
   {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and <1.0");
        }
        this.commissionRate = commissionRate;
   }

   public double getCommissionRate()
   {
        return commissionRate;
   }

   @Override
   public double earnings()
   {
        return getCommissionRate() * getGrossSales();
   }
   
 
   public String toString()
   {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","Commission Employee", super.toString(),"Gross Sales", 
        		getGrossSales(),"Commission Rate", getCommissionRate());
   }

}
  