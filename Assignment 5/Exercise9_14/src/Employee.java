
public class Employee extends Object
{
   protected final String firstName;
   protected final String lastName;
   protected final String socialSecurityNumber;
  
   
   public Employee(String firstName, String lastName, String socialSecurityNumber)
   {
	   
	   this.firstName = firstName;
	   this.lastName = lastName; 
	   this.socialSecurityNumber = socialSecurityNumber; 	   
   }     
	   
	   String getFirstName()
	   {
		   return firstName;
	   }
	   public String getLastName()
	   {
		   return lastName;
	   }
	   public String getSocialSecurityNumber()
	   {
		   return socialSecurityNumber;
	   
	   }
	   @Override
	   public String toString()
	   {
		   return String.format("%s: %s %s%n%s: %s", "Name:", firstName, lastName,
				   "Social Security Number", socialSecurityNumber); 
	   }

}

