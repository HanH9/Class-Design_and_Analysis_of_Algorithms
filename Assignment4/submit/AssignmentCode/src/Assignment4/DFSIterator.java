package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator for DFS
 * @author H9
 * @version 1.0
 */
public class DFSIterator implements Iterator<Integer> {

	private boolean[] marked; // remake the searched vertices
	private ArrayList<Integer> searchList; // record the search order
	Iterator<Integer> iterator; // help iterator
	
    public DFSIterator(Graph graph, int source) {
        this.marked = new boolean[graph.getVertexSize() + 1];
        this.searchList = new ArrayList<Integer>(graph.getVertexSize());
        
        DFS(graph, source);
        
        this.iterator = searchList.iterator();
    }
    
    /**
     * DFS process
     * @param graph searched graph
     * @param source started vertice
     */
    public void DFS(Graph graph, int source)
    {
    	marked[source] = true;
    	searchList.add(source);
    	for(int vertex: graph.getAdjacency(source).keySet())
    	{
    		if(!marked[vertex])
    		{
    			DFS(graph, vertex);
    		}
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
