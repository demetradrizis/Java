/*
 * Demetra Drizis 
 * Assignment 6
 */
import java.util.Calendar; 

public class PayrollSystemTest 
{
   public static void main( String args[] ) 
   {
       //Create subclass objects

       SalariedEmployee salariedEmployee = new SalariedEmployee ("John","Smith","111-11-1111",800.00,new Date(10,8,1997));

       HourlyEmployee hourlyEmployee= new HourlyEmployee ("Karen","Price","222-22-2222",16.75,40,new Date(12,25,2018));

       CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones","333-33-3333",10000,.06,new Date(11,01,1994));

       BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee ("Bob","Lewis","444-44-4444",5000,.04,300,new Date(3,22,2005));

      System.out.println( "Employees processed individually:\n" );
      
      System.out.printf( "%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "Earned", salariedEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "Earned", hourlyEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n",
         commissionEmployee, "Earned", commissionEmployee.earnings() );
      System.out.printf( "%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "Earned", basePlusCommissionEmployee.earnings() ); 

      // create four-element Employee array
      Employee employees[] = new Employee[ 4 ]; 

      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee; 
      employees[ 3 ] = basePlusCommissionEmployee;

      System.out.println( "Employees processed polymorphically:\n" );
      
     
      for(Employee currentEmployee: employees)
      {
    	  System.out.println(currentEmployee);
    	  
    	  if (currentEmployee instanceof BasePlusCommissionEmployee)
          {
         	 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
         	 employee.setBaseSalary(1.10 * employee.getBaseSalary());
         	 System.out.printf("New Base Salary with 10%% increase is: $%,.2f%n",
         			 employee.getBaseSalary());
          }  
          //add a $100.00 bonus to the person’s payroll amount if the current month is

          //the one in which the Employee’s birthday occurs.
    	  
          if (currentEmployee.getbirthDate().getMonth()==Calendar.getInstance().get(Calendar.MONTH)+1)
          {
               //System.out.printf("%s%n%s: $%,.2f%n",currentEmployee,"Earned",currentEmployee.earnings());
               System.out.printf("Birthday bonus : $%,.2f%n",100.00);
               System.out.printf("Earned $%,.2f%n%n", currentEmployee.earnings()+100);
          }
          else
          {

        	  //System.out.printf("%s%n%s: $%,.2f%n%n",currentEmployee,"earned",currentEmployee.earnings());
        	  System.out.printf("Earned: $%,.2f\n\n", currentEmployee.earnings()); 
          }
      }

      for(int j=0;j < employees.length;j++)

      {

          System.out.printf("Employee %d is a %s%n",j,employees[j].getClass().getName());

      }
 }
} // end class PayrollSystemTest