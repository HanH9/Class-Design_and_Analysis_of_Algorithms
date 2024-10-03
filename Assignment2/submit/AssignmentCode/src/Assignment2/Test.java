package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Tests Heap, Priority Queue, Employee and two comparators
 * @author H9
 * @version 1.0
 */
public class Test {
	public static void start() throws FileNotFoundException
	{ 
		// Makes two comparator
		Comparator<Employee> payComparator = new PayComparator();
		Comparator<Employee> nameComparator = new NameComparator();
		
		System.out.println("We have two comparators!");
		System.out.println("The first situation-using employees' name as comparator");
		// Sorted by name firstly
		PQueue<Employee> pQueue_name = new PQueue<Employee>(nameComparator);
		
		// Makes the priority queue
		create(pQueue_name);
		
		System.out.println("Display the initial queue:");
		display(pQueue_name);
		
		// Sorts the queue
		pQueue_name.sort();
		System.out.println();
		System.out.println("After sort(decreasing order):");
		display(pQueue_name);
		
		// Deletes from the queue
		pQueue_name.delete();
		pQueue_name.sort();
		System.out.println();
		System.out.println("After delete:");
		display(pQueue_name);
		
		// Sorted by pay rate secondly
		System.out.println("-------------------------------------------------------------");
		System.out.println("The second situation-using employees' pay rate as comparator");
		PQueue<Employee> pQueue_pay = new PQueue<Employee>(payComparator);
		
		// Makes the priority queue
		create(pQueue_pay);
		
		System.out.println("Display the initial queue:");
		display(pQueue_pay);
		
		// Sort the queue
		pQueue_pay.sort();
		System.out.println();
		System.out.println("After sort(decreasing order):");
		display(pQueue_pay);
		
		// Delete from the queue
		pQueue_pay.delete();
		pQueue_pay.sort();
		System.out.println();
		System.out.println("After delete:");
		display(pQueue_pay);
		
		// Test other methods
		System.out.println("-------------------------------------------------------------");
		System.out.println("Test other methods:");
		System.out.println("Is empty: " + pQueue_pay.isEmpty());
	}
	
	/**
	 * Create the priority queue
	 * @param queue A reference to a queue
	 * @throws FileNotFoundException
	 */
	public static void create(PQueue<Employee> queue) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File("assignment2_data"));
		while(scanner.hasNext())
		{
			Employee employee = new Employee();
			employee.setName(scanner.next());
			employee.setName(employee.getName()+ " " + scanner.next());
			employee.setPayRate(scanner.nextDouble());
			queue.insert(employee);
		}
	}
	
	/**
	 * Display the queue
	 * @param queue A reference to a queue
	 */
	public static void display(PQueue<Employee> queue)
	{
		queue.display();
	}
}
