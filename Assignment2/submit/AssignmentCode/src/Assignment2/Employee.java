package Assignment2;

/**
 * Represents a Employee class
 * @author H9
 * @version 1.0
 */
public class Employee 
{
	private String name; // The name of the employee
	private double payRate; // The annual income of the employee
	
	public Employee()
	{
	}
	
	public Employee(String nameTemp, double payTemp)
	{
		this.name = nameTemp;
		this.payRate = payTemp;
	}
	
	/**
	 * Get the name of employee
	 * @return The name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name to employee
	 * @param name Name of employee
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the pay rate of employee
	 * @return the Pay rate
	 */
	public double getPayRate() {
		return payRate;
	}
	
	/**
	 * Set the pay rate to employee
	 * @param payRate The pay rate
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
    @Override
    public String toString() {
        return "Name: " + this.name + ", Pay Rate:" + this.payRate;
    }
	
	
}
