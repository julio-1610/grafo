import java.util.*;
public class Grafo {
    
    class Node {
        protected int name;
        protected HashMap<Node, Integer> rel;
        
        public Node(int name) {
            this.name = name;
            this.rel = new HashMap<>();
        } 
        
        public void put(Node n, Integer value) {
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
    
    @Override
    public String toString() {
        String str = "";
        for (Node vertice : vertices) 
            str += vertice;
        return str;
    }
}
