import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;

    static List<int[]>[] adjacencyList;

    static Long[] result;

    static int[] edges;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        M = parseInt(br.readLine());

        adjacencyList = new ArrayList[N + 1];
        result = new Long[N + 1];
        edges = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; ++i) {
            String[] strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);
            int price = parseInt(strArr[2]);
            adjacencyList[startNode].add(new int[]{endNode, price});
            edges[endNode]++;
        }

        String[] strArr = br.readLine().split(" ");
        int startNode = parseInt(strArr[0]);
        int endNode = parseInt(strArr[1]);
        result[startNode] = 0L;

        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingLong(node -> node.cost));
        queue.offer(new Node(startNode, 0));

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            int node = poll.index;
            long cost = poll.cost;
            if (visited[node]) {
                continue;
            }
            visited[node] = true;
            for (int[] adjacencyNode : adjacencyList[node]) {
                int nextNode = adjacencyNode[0];
                long nextPrice = adjacencyNode[1];
                if (visited[nextNode]) {
                    continue;
                }
                if (result[nextNode] == null) {
                    result[nextNode] = cost + nextPrice;
                } else {
                    if (result[nextNode] <= cost + nextPrice) {
                        continue;
                    }
                    result[nextNode] = cost + nextPrice;
                }
                queue.offer(new Node(nextNode, result[nextNode]));
            }
        }

        sb.append(result[endNode]);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static class Node {
        int index;
        long cost;

        Node(int index, long cost) {
            this.index = index;
            this.cost = cost;
        }
    }
}