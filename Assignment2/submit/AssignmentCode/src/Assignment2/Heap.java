package Assignment2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Represents a generic ADT Heap(a min-heap)
 * @author H9
 * @version 1.0
 */
public class Heap<T> implements HeapInterface<T>
{
    private ArrayList<T> nodes; // An Arraylist as data structure, represent all nodes in the heap 
    private int size; // The heap size
    public Comparator<T> comparator; // A reference to a compartor
    
    public Heap() 
    {
        this.nodes = new ArrayList<T>();
        nodes.add(null); // Do not use the index 0 as heap node
        this.size = 0;
    }

    /**
     * Exchange key in node-i with node-j
     * @param i index of node-i
     * @param j index of node-j
     * @throws HeapIndexOutOfBoundsException
     */
    private void exchange(int i, int j) throws HeapIndexOutOfBoundsException
    {
    	if(i > size || j >size)
    	{
    		throw new HeapException("Index out of bounds!");
    	}
    	else 
    	{
        T temp = nodes.get(i);
        nodes.set(i, nodes.get(j));
        nodes.set(j, temp);
    	}
    }
    
    /**
     * Decrease the key in specific node to the new key
     * @param index The specific node's index
     * @param key The new key
     * @throws HeapException
     * @throws HeapIndexOutOfBoundsException
     */
    private void heap_decrease_key(int index, T key) throws HeapException, HeapIndexOutOfBoundsException
    {
    	if(index > size)
    	{
    		throw new HeapIndexOutOfBoundsException("Index out of bounds!");
    	}
    	else if(nodes.get(index)!=null && comparator.compare(nodes.get(index), key)<0)
    	{	
    		// The new key must smaller than the old key
    		throw new HeapException("The current key is smaller than new key!");
    	}
    	else 
    	{
    		nodes.set(index, key);
    		while(index > 1 && comparator.compare(nodes.get(index/2), nodes.get(index)) > 0)
    		{
    			exchange(index, index/2);
    			index = index/2;
    		}
		}
    }
    
    /**
     * Heapify the heap in the specific node
     * @param index The index of specific node
     * @throws HeapIndexOutOfBoundsException
     */
    private void node_heapify(int index) throws HeapIndexOutOfBoundsException
    {
    	if(index > size)
    	{
    		throw new HeapException("Index out of bounds!");
    	}
    	int left = index * 2; //Left child
    	int right = index * 2 + 1; //Right child
    	int minist; // The minist node from specific node to the leaf
    	if(left <= size && comparator.compare(nodes.get(index), nodes.get(left)) > 0)
    	{
    		minist = left;
    	}
    	else 
    	{
    		minist = index;
		}
    	if(right <= size && comparator.compare(nodes.get(right), nodes.get(minist)) < 0)
    	{
    		minist = right;
    	}
    	
    	if (minist != index)
    	{
    		exchange(index, minist);
			node_heapify(minist);
		}
    }
    
    /**
     * Insert the new node to the heap
     */
	public void insert(T t)
	{
		// Put the new node to the last as null, then decrease it's key
		nodes.add(null);
		heap_decrease_key(++size, t);
	}
	
	/**
	 * Retrieves and removes the item from the root of a heap
	 */
	public T delete() throws HeapException
	{
		if(size < 1)
		{
			throw new HeapException("Heap overflow!");
		}
		
		// Get the root, then exchange root with the last node
		T root = nodes.get(1);
		exchange(1, size);
		
		// Heapify the new root
		node_heapify(1);
		
		// Remove the root from the heap
		nodes.set(size, null);
		size--;
		
		return root;
	}
	
	/**
	 * Rebuild the whole heap to maintain the heap properties.
	 */
	public void heapify()
	{
		int j = size;
		// when index > j/2, all of these nodes are leaf
		for(int i = j/2; j > 1; j--)
		{
			node_heapify(i);
		}
	}
	
	/**
	 * Determines if a heap is empty
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * Sorts the items in a heap using the heapsort algorithm.
	 */
	public void sort()
	{
		int size_temp = size;
		// Firstly, heapify the whole heap
		heapify();
		// Sort the heap in decreasing order
		for(int i = size; size > 1; i--)
		{
			exchange(1, i);
			size--;
			node_heapify(1);
		}
		size = size_temp;
	}

	/**
	 * Display all nodes in the heap
	 */
	public void display()
	{
		int i = 1;
		while(i <= this.size)
		{
			System.out.println(nodes.get(i));
			i++;
		}
	}
}
