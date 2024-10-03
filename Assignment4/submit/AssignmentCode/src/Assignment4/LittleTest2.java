package Assignment4;

/**
 * litte test to help progroming
 * @author H9
 */
public class LittleTest2 
{
	public static void main(String[] args) 
	{
		
		Graph graph = new Graph(5);
		graph.addEdge(1, 2, 45);
		graph.addEdge(1, 5, 20);
		graph.addEdge(5, 2, 120);
		graph.addEdge(5, 4, 220);
		graph.addEdge(2, 4, 60);
		graph.addEdge(2, 3, 70);
		graph.addEdge(3, 4, 30);
		
		System.out.println("BFS:");
		BFSIterator iterator = new BFSIterator(graph, 3);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("DFS:");
		DFSIterator iterator2 = new DFSIterator(graph, 3);
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
	}
}
