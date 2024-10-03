package Assignment4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/**
 * Iterator for BFS 
 * @author H9
 * @version 1.0
 */
public class BFSIterator implements Iterator<Integer> {

	private boolean[] marked; // remake the searched vertices
	private Queue<Integer> waitSearch; // waiting queue
	private ArrayList<Integer> searchList; // record the search order
	Iterator<Integer> iterator; // help iterator
	
    public BFSIterator(Graph graph, int source) {
        this.marked = new boolean[graph.getVertexSize() + 1];
        this.waitSearch = new ArrayDeque<>();
        this.searchList = new ArrayList<Integer>(graph.getVertexSize());
        
        BFS(graph, source);
        
        this.iterator = searchList.iterator();
    }
    
    /**
     * BFS process
     * @param graph searched graph
     * @param source started vertice
     */
    public void BFS(Graph graph, int source)
    {
    	marked[source] = true;
    	waitSearch.add(source);
    	while(!waitSearch.isEmpty())
    	{
    		int next = waitSearch.poll();
    		
    		for(int vertex: graph.getAdjacency(next).keySet())
    		{
    			if (!marked[vertex])
    			{
					waitSearch.add(vertex);
					marked[vertex] = true;
				}
    		}
    		
    		searchList.add(next); // finish searching this vertice
    	}
    }
    
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Integer next() {
		return iterator.next();
	}
	
	@Override
	public void remove()
	{
		iterator.remove();
	}

}
