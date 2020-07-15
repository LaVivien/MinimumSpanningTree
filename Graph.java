package graphMinSpanningTree;

import java.util.*;

public class Graph<T> { 
    
   Map<T, List<GraphEdge<T>>> adj = new HashMap<>();
   Set<T> nodes = new HashSet<>();

	public void addEdge(T u, T v, int w) { 	
		nodes.add(u);
		nodes.add(v);
		List<GraphEdge<T>> list = adj.getOrDefault(u, new ArrayList<>());
		list.add(new GraphEdge<>(u, v, w));
		adj.put(u,list);
	} 
	
	public void addNode(T u) {
		nodes.add(u);
	}
	
	public Set<T> nodes() {
		return nodes;
	}
	
	public List<GraphEdge<T>> edges(){
		List<GraphEdge<T>> res =new ArrayList<>();
		for (Map.Entry<T, List<GraphEdge<T>>> entry: adj.entrySet()) {
			res.addAll(entry.getValue());
		}
		Collections.sort(res, (a, b) -> a.weight - b.weight);
		return res;
	}
	
	public static void main(String[] arags) { 
		Graph<Integer> g=new Graph<>();
	    g.addEdge(0, 1, 7);   
	    g.addEdge(1, 2, 8);
	    g.addEdge(0, 3, 5);    
	    g.addEdge(1, 3, 9); 
	    g.addEdge(1, 2, 8); 
	    g.addEdge(1, 4, 7); 
	    g.addEdge(4, 3, 15); 	    
	    g.addEdge(3, 5, 6);   
	    g.addEdge(4, 5, 11); 
	    g.addEdge(4, 6, 9);   
	    g.addEdge(4, 2, 5); 

	    System.out.println(g.nodes());
	    System.out.println(g.edges());
	} 
}