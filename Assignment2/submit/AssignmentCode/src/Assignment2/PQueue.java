package Assignment2;

import java.util.Comparator;

/**
 * Represents a generic ADT Priority Queue
 * @author H9
 * @version 1.0
 */
public class PQueue<T> implements PQueueInterface<T>
{
	private Heap<T> heap; // Use a heap as data structure
	
	public PQueue(Comparator<T> comparator)
	{
		this.heap = new Heap<T>();
		this.heap.comparator = comparator;
	}
	
	/**
	 * Inserts an item into a heap of this queue.
	 */
	public void insert(T t)
	{
		heap.insert(t);
	}
	
	/**
	 * Retrieves and removes the item in the root of a heap.
	 */
	public T delete()
	{
		return heap.delete();
	}
	
	/**
	 * Determines if the heap is empty.
	 */
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	/**
	 * Sorts the items in the heap.
	 */
	public void sort()
	{
		heap.sort();
	}
	
	/**
	 * Display the queue
	 */
	public void display()
	{
		heap.display();
	}
	
}
