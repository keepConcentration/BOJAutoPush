import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static class Graph {
        LinkedList<Integer>[] adjacentNodeListArray;
        LinkedList<Boolean> visitedList;


        public Graph(int nodeCount) {
            this.adjacentNodeListArray = new LinkedList[nodeCount + 1];
            visitedList = new LinkedList<>();
            visitedList.add(false);
            for (int i = 1; i <= nodeCount; ++i) {
                this.adjacentNodeListArray[i] = new LinkedList<>();
                visitedList.add(false);
            }
        }

        public void addEdge(int startIndex, int endIndex) {
            if (!this.adjacentNodeListArray[startIndex].contains(endIndex) || this.adjacentNodeListArray[endIndex].contains(startIndex)) {
                this.adjacentNodeListArray[startIndex].add(endIndex);
                this.adjacentNodeListArray[endIndex].add(startIndex);
            }
        }
    }

    static Graph graph;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int V = Integer.parseInt(arr[2]);

        graph = new Graph(N);
        for (int i = 0; i < M; ++i) {
            arr = br.readLine().split(" ");
            graph.addEdge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }

        for (int i = 1; i < graph.adjacentNodeListArray.length; ++i) {
            Collections.sort(graph.adjacentNodeListArray[i]);
        }

        dfs(V);
        sb.append("\n");

        for (int i = 0; i < graph.visitedList.size(); ++i) {
            graph.visitedList.set(i, false);
        }

        bfs(V);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int node) {
        if (graph.visitedList.get(node)) {
            return;
        }
        sb.append(node).append(" ");
        graph.visitedList.set(node, true);
         for (Integer adjacentNode : graph.adjacentNodeListArray[node]) {
            if (!graph.visitedList.get(adjacentNode)) {
                dfs(adjacentNode);
            }
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        graph.visitedList.set(node, true);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            graph.visitedList.set(poll, true);
            sb.append(poll).append(" ");
            for (int i = 0; i < graph.adjacentNodeListArray[poll].size(); ++i) {
                int adjacentNode = graph.adjacentNodeListArray[poll].get(i);
                if (!graph.visitedList.get(adjacentNode) && !queue.contains(adjacentNode)) {
                    queue.add(adjacentNode);
                }
            }
        }
    }
}