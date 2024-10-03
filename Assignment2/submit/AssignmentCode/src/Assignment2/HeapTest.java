package Assignment2;

import java.util.Comparator;

//import java.util.ArrayList;

/**
 * The test code in coding
 * @author H9
 */
public class HeapTest {
	public static void main(String[] args) 
	{
//		ArrayList<Integer> a = new ArrayList<Integer>(1);
//		a.add(null);
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(2);
//		System.out.println(a.size());
		Heap<Employee> a = new Heap<Employee>();
//		Comparator<Employee> comparator = new NameComparator();
		Comparator<Employee> comparator = new PayComparator();
		a.comparator = comparator;
//		a.insert(2);
//		a.insert(7);
//		a.insert(1);
//		a.insert(6);
//		a.insert(5);
		//a.heaopify();
		Employee e1 = new Employee("Hank",33.3);
		Employee e2 = new Employee("Alice",888.0);
		Employee e3 = new Employee("Joker",666.0);
		a.insert(e1);
		a.insert(e2);
		a.insert(e3);
		System.out.println(a.isEmpty());
		a.sort();
		a.display();
		System.out.println(a.delete());
		a.sort();
		System.out.println(a.delete());
		a.sort();
		System.out.println(a.delete());

	}
}
