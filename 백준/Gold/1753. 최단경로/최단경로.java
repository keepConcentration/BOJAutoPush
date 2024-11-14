import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int V, E;

    static List<Node>[] adjacencyList;

    static boolean[] visited;
    static int[] edges;

    static Integer[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        V = parseInt(strArr[0]);
        E = parseInt(strArr[1]);

        adjacencyList = new ArrayList[V + 1];
        visited = new boolean[V + 1];
        edges = new int[V + 1];
        result = new Integer[V + 1];

        for (int i = 1; i <= V; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        int start = parseInt(br.readLine());

        for (int i = 0; i < E; ++i) {
            strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);
            int weight = parseInt(strArr[2]);

            adjacencyList[startNode].add(new Node(endNode, weight));
            edges[endNode]++;
        }

        for (int i = 1; i <= V; ++i) {
            if (edges[i] == 0) {
                result[i] = Integer.MAX_VALUE;
            }
        }

        result[start] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        queue.offer(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            int node = poll.index;
            int weight = poll.weight;
            visited[node] = true;

            for (Node adjacencyNode : adjacencyList[node]) {
                int nextIndex = adjacencyNode.index;
                int nextWeight = adjacencyNode.weight + weight;
                if (!visited[nextIndex]) {
                    if (result[nextIndex] == null) {
                        result[nextIndex] = nextWeight;
                    } else {
                        if (result[nextIndex] < nextWeight) {
                            continue;
                        }
                        result[nextIndex] = Math.min(result[nextIndex], nextWeight);
                    }
                    queue.offer(new Node(nextIndex, result[nextIndex]));
                }
            }
        }

        for (int i = 1; i <= V; ++i) {
            if (result[i] == null || result[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(result[i]).append("\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static class Node {
        int index;
        int weight;

        Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
    }

}