package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Implementation of Graph
 * @author H9
 * @version 1.0
 */
public class Graph implements GraphInterface {

    private final int vertexSize;	// The number of vertice
    private int edgeSize;	// The number of edge
    private List<TreeMap<Integer, Integer>> list;	// An adjacency list
 
    public Graph(int V) {
        // Initialize the number of vertice
        this.vertexSize = V;
        // Initialize the number of edge
        this.edgeSize = 0;
        // Initialize the adjacency list
        this.list = new ArrayList<TreeMap<Integer, Integer>>(V);
        for (int i = 0; i < V; i++) 
        {
            list.add(new TreeMap<Integer, Integer>());
        }
    }
 
    /**
     * Gets the number of vertice
     * @return the number of vertice
     */
    public int getVertexSize() {
        return vertexSize;
    }
 
    /**
     * Gets the number of edge
     * @return the number of edge
     */
    public int getEdgeSize(){
        return edgeSize;
    }
    
    /**
     * Examines if an edge exists between two given vertices
     * @return 1 for true, 0 for false
     */
    public int searchEdge(int u, int v)
    {
    	if(list.get(u-1).get(v) == null)
    	{
    		return 0;
    	}
    	else
    	{
    		return 1;
    	}
    }
    
    /**
     * Add an edge given two vertices and a weight
     * @param u the first edge
     * @param v the second edge
     * @param weight the weight between two edges
     */
    public void addEdge(int u, int v, int weight) 
    {
    	
    	// only one edge can exist between two vertice
    	if(searchEdge(u, v) == 1)
    	{
    		System.err.println("One edge has existed between two vertices");
    	}
    	else 
    	{
	    	// u adds edge
	        list.get(u-1).put(v, weight);
	        // v adds edge
	        list.get(v-1).put(u, weight);
	        edgeSize++;
    	}
    }
    
    /**
     * Add a given edge
     * @param edge a given edge
     */
    public void addEdge(Edge edge)
    {
    	// get the information of edge
    	int u = edge.getU();
    	int v = edge.getV();
    	int weight = edge.getWeight();

    	// only one edge can exist between two vertice
    	if(searchEdge(u, v) == 1)
    	{
    		System.err.println("One edge has existed between two vertices");
    	}
    	else 
    	{
	        list.get(u-1).put(v, weight);
	        list.get(v-1).put(u, weight);
	        edgeSize++;
    	}
    }
    
    /**
     * Retrieves the weight of an edge given its two vertices
     * @param u the first vertice
     * @param v the second vertice
     * @return the weight between two vertices
     */
    public int getWeight(int u, int v)
    {
    	if(searchEdge(u, v) == 0)
    	{
    		System.err.println("No such edge");
    		return 0;
    	}
    	else 
    	{
			return list.get(u-1).get(v);
		}
    }
    
    /**
     * Removes a given edge
     * @param edge a given edge
     */
    public void removeEdge(Edge edge)
    {
    	int u = edge.getU();
    	int v = edge.getV();
    	
    	if(searchEdge(u, v) == 0)
    	{
    		System.err.println("No such edge");
    	}
    	else
    	{
	        list.get(u-1).remove(v);
	        list.get(v-1).remove(u);
	        edgeSize--;
    	}
    }
    
    /**
     * Find/return the edge between two given vertices
     * @param u the first vertex
     * @param v	the second vertex
     * @return the edge between two vetices
     */
    public Edge getEdge(int u, int v)
    {
    	if(searchEdge(u, v) == 0)
    	{
    		System.err.println("No such edge");
    		return null;
    	}
    	else 
    	{
    		int weight = getWeight(u, v);
    		Edge edge = new Edge(u, v, weight);
    		return edge;
		}
    }
    
    /**
     * Get the adjacency list given a first vertex
     * @param u the first vertex
     * @return	the adjacency list
     */
    public TreeMap<Integer, Integer> getAdjacency(int u)
    {
    	return list.get(u-1);
    }
}