package Assignment2;

import java.util.Comparator;

/**
 * Represents a comparator using employee's name
 * @author H9
 * @version 1.0
 */
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
