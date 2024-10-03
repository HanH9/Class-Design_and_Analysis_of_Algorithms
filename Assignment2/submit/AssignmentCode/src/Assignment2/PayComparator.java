package Assignment2;

import java.util.Comparator;

/**
 * Represents a comparator using employee's pay rate
 * @author H9
 * @version 1.0
 */
public class PayComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getPayRate()-o2.getPayRate());
	}
	
}
