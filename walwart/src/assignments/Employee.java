package assignments;

public abstract class Employee
{
	private String firstName;//declare first name
	private String lastName;//declare last name
	
	public Employee(String fn, String ln)
	{ 
		firstName = fn;
		lastName = ln;

	}
	public String toString()//prints Employee object
	{
		return(firstName + " " + lastName); 
	}
	abstract double pay(double period);
	//must change public class to public abstract class in order for it to work.

}
