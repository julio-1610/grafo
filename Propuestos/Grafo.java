import java.util.*;
public class Grafo {
    
    class Node {
        protected int name;
        protected HashMap<Node, Integer> rel;
        
        public Node(int name) {
            this.name = name;
            this.rel = new HashMap<>();
        } 
        
        public void put(Node n, int value) {
            rel.put(n, value);
        }
        
        public int get(Node n) {
            return rel.get(n);
        }
        
        @Override
        public String toString() {
            String str = name + " =>";
            if(!rel.isEmpty())  
                for (Node node : rel.keySet()) 
                    str +=  "   (" + node.name + ", " + rel.get(node) + ")";
            return str + "\n";
        }
    }
    
    private Node[] vertices;
    
    public Grafo(int cant) {
        this.vertices = new Node[cant];
        for (int i = 0; i < cant; i++) 
            vertices[i] = new Node(i + 1);
    }
    
    public void put(int node, int edge, int value) {
        if (!vertices[node - 1].rel.containsKey(vertices[edge - 1])) {
            vertices[node - 1].put(vertices[edge - 1], value);
            vertices[edge - 1].put(vertices[node - 1], value);
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        for (Node vertice : vertices) 
            str += vertice;
        return str;
    }
}

