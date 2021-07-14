/*
 * Demetra Drizis 
 * Assignment 6
 */
public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthDate; 

   // three-argument constructor
   public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.birthDate = birthDate;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName(String firstName)
   {
      firstName = firstName;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName(String lastName)
   {
      lastName = lastName;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber(String socialSecurityNumber)
   {
      socialSecurityNumber = socialSecurityNumber; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber
   
   
   public Date getbirthDate()
   {
	   return birthDate; 
   }

   // return String representation of Employee object
   public String toString()
   {
      return String.format( "%s %s%nSocial Security Number: %s%nBirth date: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(), getbirthDate() );
   } // end method toString

   // abstract method overridden by subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee