# Graph Minimal Spanning Tree

## Problem Statement
Consider the Graph.java, GraphEdge.java and GraphNode.java from the previous DFS assignment.Consider the UnionFind.java which implements the UnionFind Data Structure: UnionFind.java

1) Write a new Graph.java which stores the edge weights in the HashTable (HashMap). Note that it is not enough just to modify GraphEdge.java to include a new field for the weights.

2) Starting from the Main function in the previous assignment (DFS). Delete the DFS call, and apply Kruskal (Kruskal.java) to the same graph, printing the MST (list of edges).

3) Write the a new class for Kruskal.java using the UnionFind Data Structure which deals with weighted graphs. The output is in the same format as the output from Kruskal.java (shown above), ie a list of graph edges belonging to the mst.

4) Modify the Main function to apply Kruskal to the following (weighted) graph ,notice that with this example you will get a forest, ie 2 trees, for the MST, since the starting graph is disconnected. By the way, the weight for edge AD is 105)

## How to run
Run the main method in Kruskal.java to get minimal spanning tree.