public class Test {
    public static void main(String[] args) {
        Grafo g = new Grafo(7);
        g.put(1, 3, 1);
        g.put(1, 2, 8);
        g.put(2, 1, 8);
        g.put(2, 3, 5);
        g.put(2, 4, 2);
        g.put(2, 4, 2);
        g.put(3, 1, 1);
        g.put(4, 2, 2);
        g.put(4, 3, 7);
        g.put(5, 3, 5);
        g.put(5, 7, 3);
        g.put(6, 5, 9);
        g.put(7, 5, 3);
        System.out.println(g);
    }
}

