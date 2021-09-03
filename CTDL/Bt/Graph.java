import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
    public static void main(String[] args) {
        int[][] graph = { 
                            { 0, 1, 0, 0, 0, 0, 0 }, 
                            { 1, 0, 1, 1, 1, 0, 0 }, 
                            { 0, 1, 0, 0, 0, 1, 0 },
                            { 0, 1, 0, 0, 0, 1, 1 }, 
                            { 0, 1, 0, 0, 0, 0, 1 }, 
                            { 0, 0, 1, 1, 0, 0, 0 }, 
                            { 0, 0, 0, 1, 1, 0, 0 } 
                        };

        DFS(graph);
        BFS(graph);
    }

    public static void DFS(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();

        stack.push(0);
        set.add(0);

        while (!stack.isEmpty()) {
            int t = stack.pop();
            System.out.print(t + " -> ");

            for (int i = 0; i < graph.length; i++) {
                if (graph[t][i] != 0 && !set.contains(i)) {
                    stack.push(i);
                    set.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void BFS(int[][] graph){
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<>();

        queue.add(0);
        set.add(0);

        while (!queue.isEmpty()) {
            int t = queue.poll();
            System.out.print(t + " -> ");

            for (int i = 0; i < graph.length; i++) {
                if (graph[t][i] != 0 && !set.contains(i)) {
                    queue.add(i);
                    set.add(i);
                }
            }
        }
        System.out.println();
    }
}
