package Assignment4;

import java.util.TreeMap;

public interface GraphInterface {
	
    /**
     * Gets the number of vertice
     * @return the number of vertice
     */
    public int getVertexSize();
    
    /**
     * Gets the number of edge
     * @return the number of edge
     */
    public int getEdgeSize();
    
    /**
     * Examines if an edge exists between two given vertices
     * @return 1 for true, 0 for false
     */
    public int searchEdge(int u, int v);
    
    /**
     * Add an edge given two vertices and a weight
     * @param u the first edge
     * @param v the second edge
     * @param weight the weight between two edges
     */
    public void addEdge(int u, int v, int weight);
    
    /**
     * Add a given edge
     * @param edge a given edge
     */
    public void addEdge(Edge edge);
    
    /**
     * Retrieves the weight of an edge given its two vertices
     * @param u the first vertice
     * @param v the second vertice
     * @return the weight between two vertices
     */
    public int getWeight(int u, int v);
    
    /**
     * Removes a given edge
     * @param edge a given edge
     */
    public void removeEdge(Edge edge);
    
    /**
     * Find/return the edge between two given vertices
     * @param u the first vertex
     * @param v	the second vertex
     * @return the edge between two vetices
     */
    public Edge getEdge(int u, int v);
    
    /**
     * Get the adjacency list given a first vertex
     * @param u the first vertex
     * @return	the adjacency list
     */
    public TreeMap<Integer, Integer> getAdjacency(int u);
}
