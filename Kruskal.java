package graphMinSpanningTree;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "unchecked", "rawtypes" })

public class Kruskal<T> {	
	  public List<GraphEdge<T>> weightedMST(Graph<T> g) {
		  ArrayList<GraphEdge<T>> mst = new ArrayList<>();
		  List<GraphEdge<T>> edges = g.edges();
		  UnionFind<T> uf =  new UnionFind(g.nodes().iterator());		    
		  for(GraphEdge<T> edge: edges) {
			  if (!uf.find(edge.src).equals(uf.find(edge.dest)) ) {
				  mst.add(edge);
				  uf.union(edge.src,edge.dest);
			  }	    	
		  }
		  return mst;
	  }

	  public static void main(String[] args) {
		  Graph<String> g = new Graph<>();
		  String[] nodeNames = { "a", "b", "c", "d", "e", "f", "g", "h" };
		  for (String s : nodeNames )
			  g.addNode(s);
		  g.addEdge("a","b", 1);
		  g.addEdge("a","c", 7);
		  g.addEdge("b","c", 5);    
		  g.addEdge("b","e", 8);
		  g.addEdge("e","d", 3);
		  g.addEdge("e","c", 9);
		  g.addEdge("c","d", 11);
		  g.addEdge("a","d", 10);	    	    

		  g.addEdge("g","h", 6);
		  g.addEdge("g","f", 4);
		  g.addEdge("f","h", 2);	    
		  Kruskal<String> k = new Kruskal<>();
		  List<GraphEdge<String>> mst = k.weightedMST(g);
		  System.out.println("minimal spanning tree = "+mst);
	  }
}
