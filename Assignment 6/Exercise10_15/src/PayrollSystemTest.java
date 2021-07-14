/*
 * Demetra Drizis 
 * Assignment 6
 */

// Employee hierarchy test program.

public class PayrollSystemTest
{
   public static void main( String args[] )
   {
      // create subclass objects
      SalariedEmployee salariedEmployee =
        new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
      CommissionEmployee commissionEmployee =
        new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06 );
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
     
PieceworkerEmployee pieceworkerEmployee = new PieceworkerEmployee("Deborah","Williams","555-55-5555",60.00,20);

      System.out.println( "Employees processed individually:\n" );

      System.out.printf( "%s\n%s: $%,.2f\n\n",
         salariedEmployee, "Earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "Earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "Earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "Earned", basePlusCommissionEmployee.earnings() );
      System.out.printf("%s\n%s: $%,.2f\n\n", pieceworkerEmployee,"Earned",pieceworkerEmployee.earnings());

     // create five-element Employee array to include pieceworker this time
      Employee employees[] = new Employee[ 5 ];

      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee;
      employees[ 3 ] = basePlusCommissionEmployee;
      employees[ 4 ] = pieceworkerEmployee;

      System.out.println( "Employees processed polymorphically:\n" );

      // generically process each element in array employees
      for (Employee currentEmployee : employees)
      {
         System.out.println(currentEmployee); // invokes toString
         
         if (currentEmployee instanceof BasePlusCommissionEmployee)
         {
        	 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
        	 employee.setBaseSalary(1.10 * employee.getBaseSalary());
        	 System.out.printf("New Base Salary with 10%% increase is: $%,.2f%n",
        			 employee.getBaseSalary());
         }
         System.out.printf("Earned: $%,.2f\n\n", currentEmployee.earnings());
      } // end for
      
      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf( "Employee %d is a %s\n", j,
            employees[j].getClass().getName());
   } // end main
} // end class PayrollSystemTest

