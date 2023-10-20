package Graph;

import java.util.*;

public class Graph {
    private Map<String, List<String>> graph;

    public Graph(Map<String, List<String>> graph) {
        this.graph = graph;
    }

    // Fungsi untuk mencari lintasan Euler pada graf
    public List<String> findEulerianPath() {
        // Cek apakah graf memiliki lintasan Euler atau tidak
        List<String> oddDegreeVertices = new ArrayList<>();
        for (String v : graph.keySet()) {
            if (graph.get(v).size() % 2 == 1) {
                oddDegreeVertices.add(v);
            }
        }
        if (oddDegreeVertices.size() != 0 && oddDegreeVertices.size() != 2) {
            return null;
        }
        // Inisialisasi
        String startVertex = oddDegreeVertices.size() == 1 ? oddDegreeVertices.get(0) : graph.keySet().iterator().next();
        List<String> path = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(startVertex);
        // Algoritma DFS untuk mencari lintasan Euler
        while (!stack.isEmpty()) {
            String vertex = stack.peek();
            if (!graph.get(vertex).isEmpty()) {
                String nextVertex = graph.get(vertex).remove(0);
                stack.push(nextVertex);
            } else {
                path.add(stack.pop());
            }
        }
        Collections.reverse(path);
        return path;
    }

    // Fungsi untuk mencari sirkuit Hamilton pada graf
    public List<String> findHamiltonianCycle() {
        // Inisialisasi
        String startVertex = graph.keySet().iterator().next();
        List<String> path = new ArrayList<>();
        Map<String, Boolean> visited = new HashMap<>();
        for (String v : graph.keySet()) {
            visited.put(v, false);
        }
        visited.put(startVertex, true);
        path.add(startVertex);
        // Rekursi untuk mencari sirkuit Hamilton
        if (hamiltonianCycle(startVertex, 1, path, visited)) {
            return path;
        } else {
            return null;
        }
    }

    // Fungsi rekursi untuk mencari sirkuit Hamilton
    private boolean hamiltonianCycle(String vertex, int count, List<String> path, Map<String, Boolean> visited) {
        if (count == graph.size() && graph.get(vertex).contains(path.get(0))) {
            return true;
        }
        for (String v : graph.get(vertex)) {
            if (!visited.get(v)) {
                visited.put(v, true);
                path.add(v);
                if (hamiltonianCycle(v, count+1, path, visited)) {
                    return true;
                }
                visited.put(v, false);
                path.remove(path.size()-1);
            }
        }
        return false;
    }

    // Main function untuk menjalankan simulasi
    public static void main(String[] args) {
        // Representasi graf menggunakan map
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "D", "E"));
        graph.put("D", Arrays.asList("B", "C", "E"));
        graph.put("E", Arrays.asList("C", "D"));

        // Buat objek graf
        Graph g = new Graph(graph);
    }
}
       
