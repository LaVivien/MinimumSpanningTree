package graphMinSpanningTree;

public class GraphEdge<E> {
    E src, dest;
    int weight;
    
    public GraphEdge(E src, E dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + src + ", " + dest + ", " + weight + ")";
    }
}
