package Assignment4;

/**
 * Tests Graph, Edge, 2 Iterator
 * @author H9
 * @version 1.0
 */
public class Test 
{
	public static void start()
	{
		// Creates the graph with 5 vertexs
		Graph graph = new Graph(5);
		System.out.println("The number of vertexs:" + graph.getVertexSize());
		System.out.println("-----------------------------------");
		
		// Adds edges
		create(graph);
		System.out.println("Edges of 1:" + graph.getAdjacency(1));
		System.out.println("Edges of 2:" + graph.getAdjacency(2));
		System.out.println("Edges of 3:" + graph.getAdjacency(3));
		System.out.println("Edges of 4:" + graph.getAdjacency(4));
		System.out.println("Edges of 5:" + graph.getAdjacency(5));
		System.out.println("-----------------------------------");
		
		// DFS at vertex 1
		DFSIterator iterator1 = new DFSIterator(graph, 1);
		System.out.println("DFS at 1:");
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		System.out.println("-----------------------------------");
		
		// BFS at vertex 1
		BFSIterator iterator2 = new BFSIterator(graph, 1);
		System.out.println("BFS at 1:");
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
		System.out.println("-----------------------------------");

		// Gets weight between 1 and 2
		System.out.println("Weight between 1 and 2:" + graph.getWeight(1, 2));
		System.out.println("-----------------------------------");
		
		// Removes edge 1-2
		Edge edge1 = graph.getEdge(1, 2);
		graph.removeEdge(edge1);
		System.out.println("After remove 1-2, adjacency list of 1:" + graph.getAdjacency(1));
		System.out.println("The number of edges:" + graph.getEdgeSize());
		System.out.println("-----------------------------------");
		
	}
	
	public static void create(Graph graph)
	{
		// Addds given edges
		graph.addEdge(1, 2, 45);
		graph.addEdge(1, 5, 20);
		graph.addEdge(5, 2, 120);
		graph.addEdge(5, 4, 220);
		graph.addEdge(2, 4, 60);
		graph.addEdge(2, 3, 70);
		
		Edge edge = new Edge(3, 4, 30);
		graph.addEdge(edge);
	}
	
	
}
