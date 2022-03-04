package assignments;

public class Associate extends Employee
{
	private double hourlyPayRate;
	
	public Associate(String fn, String ln, double rates)
	{
		super(fn, ln);
		hourlyPayRate = rates;
	} 
	
	public double pay(double hours)
	{
		double payEarned;
		
		if(hours > 40)
		{
			payEarned = ((hourlyPayRate *40)+ (hourlyPayRate *1.5)*(hours - 40));
		}
		else
		{
			payEarned = hours * hourlyPayRate;
		}
		return payEarned;
	} 
	public String toString()
	{
		return(super.toString()
				+ ", Assocoiate"
				+ "Pay Rate"+ hourlyPayRate);
	}
	
}//closes class