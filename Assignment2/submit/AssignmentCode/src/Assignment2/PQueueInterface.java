package Assignment2;

/**
 * Represents a generic ADT Priority Queue interface
 * @author H9
 * @version 1.0
 */
public interface PQueueInterface<T> 
{
	/**
	 * Inserts an item into a heap of this queue.
	 */
	public void insert(T t);
	
	/**
	 * Retrieves and removes the item in the root of a heap.
	 */
	public T delete();
	
	/**
	 * Determines if the heap is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Sorts the items in the heap.
	 */
	public void sort();
}
