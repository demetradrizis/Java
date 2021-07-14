
public class HourlyEmployee extends Employee
{
	protected double hours;
	protected double wage; 
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double hours, double wage)
	{
		super(firstName, lastName, socialSecurityNumber); 
		
		if (hours < 0 || hours > 168)
		{
			throw new IllegalArgumentException("Hours worked must be between 0 and 168");
		}
		if (wage < 0)
		{
			throw new IllegalArgumentException("Wage cannot be negative"); 
		}
		
		
		this.hours = hours;
		this.wage = wage; 
	}
	
	public void setHours(double hours)
	{
		if (hours < 0 || hours > 168)
		{
			throw new IllegalArgumentException("Hours worked must be between 0 and 168");
		}
		
		this.hours = hours; 
	}
	public double getHours()
	{
		return hours;
	}
	public void setWage(double wage)
	{
		if (wage < 0)
		{
			throw new IllegalArgumentException("Wage cannot be negative"); 
		}
		
		this.wage = wage;
	}
	public double getWage()
	{
		return wage;
	}

	public double earnings()
	{
		return getHours() * getWage(); 
	}
	
	@Override
	   public String toString()
	   {
		   return String.format("%s: %s %s%n%s: %s%n%s:", "Name:", firstName, lastName,
				   "Social Security Number", socialSecurityNumber, hours, wage); 
	   }
	
}
