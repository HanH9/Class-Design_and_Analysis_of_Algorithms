package Assignment4;

import java.util.TreeMap;

/**
 * litte test to help progroming
 * @author H9
 */
public class LittleTest {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>(6);
//		list.add(1);
//		list.add(2);
//		System.out.println(list.size());
//		for(int i = 0; i < list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		Graph graph = new Graph(5);
		graph.addEdge(1, 2, 45);
		graph.addEdge(1, 5, 20);
		graph.addEdge(5, 2, 120);
		graph.addEdge(5, 4, 220);
		graph.addEdge(2, 4, 60);
		graph.addEdge(2, 3, 70);
		graph.addEdge(3, 4, 30);
		
		Edge edge = new Edge(1, 2, 45);
		
		Edge edge2 = new Edge(1, 3, 9);
		
		TreeMap<Integer, Integer> treeMap = graph.getAdjacency(1);
		System.out.println("Initial 1: "+treeMap);
		System.out.println("-----------------------------------");
		
		graph.removeEdge(edge);
		System.out.println("Remove 1-2: "+treeMap);
		System.out.println("-----------------------------------");
		
		System.out.println("Try to remove 1-3:");
		graph.removeEdge(edge2);
		System.out.println("-----------------------------------");
		
		graph.addEdge(edge2);
		System.out.println("Add 1-3: "+treeMap);
		System.out.println("-----------------------------------");

		Edge edge3 = graph.getEdge(1, 5);
		System.out.println("Get 1-5:"+edge3);
		int weight = graph.getWeight(1, 5);
		System.out.println("1-5 weight:"+weight);
		System.out.println("-----------------------------------");
		
		System.out.println("V£º"+graph.getVertexSize()+", E:"+graph.getEdgeSize());
		
		
//		List<TreeMap<Integer, Integer>> list = new ArrayList<TreeMap<Integer, Integer>>(5);
//		System.out.println(list.size());
//        for (int i = 0; i < 5; i++) 
//        {
//            list.add(new TreeMap<Integer, Integer>());
//        }
//		System.out.println(list.size());
}
}
