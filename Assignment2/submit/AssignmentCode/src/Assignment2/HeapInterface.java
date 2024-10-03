package Assignment2;

/**
 * Represents a generic ADT Heap interface(a min-heap)
 * @author H9
 * @version 1.0
 */
public interface HeapInterface<T> 
{
    /**
     * Insert the new node to the heap
     */
	public void insert(T t);
	
	/**
	 * Retrieves and removes the item from the root of a heap
	 */
	public T delete();
	
	/**
	 * Rebuild the whole heap to maintain the heap properties.
	 */
	public void heapify();
	
	/**
	 * Determines if a heap is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Sorts the items in a heap using the heapsort algorithm.
	 */
	public void sort();
	
}
