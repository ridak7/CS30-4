package assignments;

public class Manager extends Employee
{
	double yearlySalary;
	
	public Manager(String fn, String ln, double sal)
	{ 
		super(fn, ln);
		yearlySalary = sal;
	} 
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary/52*weeks;//pay earned for manager
		return payEarned;
	}
	
	public String toString()//print Employee object
	{
		return(super.toString() +", Manager"
				+ "Salary"+ "yearlySalary");
	}
	
}