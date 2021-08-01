import java.util.*;
public class Grafo {
    
    class Node {
        protected int name;
        protected HashMap<Node, Integer> rel;
        
        public Node(int name) {
            this.name = name;
        } 
        
        public void put(Node n, Integer value) {
            rel.put(n, value);
        }
        
        @Override
        public String toString() {
            String str = name + " =>";
            if(!rel.isEmpty())  
                for (Node node : rel.keySet()) 
                    str +=  "   (" + node + ", " + rel.get(node) + ")";
            return str;
        }
    }
}
