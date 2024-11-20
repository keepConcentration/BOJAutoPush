import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    static List<int[]>[] adjacencyList;

    static int[] result;
    static int[] prevNode;
    static int[] edges;

    public static void main(String[] args) throws IOException {
        N = parseInt(br.readLine());
        int M = parseInt(br.readLine());

        adjacencyList = new ArrayList[N + 1];
        result = new int[N + 1];
        prevNode = new int[N + 1];
        edges = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; ++i) {
            String[] strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);
            int weight = parseInt(strArr[2]);

            adjacencyList[startNode].add(new int[] {endNode, weight});
            edges[endNode]++;
        }

        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o2.weight - o1.weight);
        queue.offer(new Node(1, 0));

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            int node = poll.index;
            int weight = poll.weight;
            for (int[] adjacencyNode : adjacencyList[node]) {
                int nextNode = adjacencyNode[0];
                int nextWeight = adjacencyNode[1] + weight;
                edges[nextNode]--;
                if (result[nextNode] < nextWeight) {
                    result[nextNode] = nextWeight;
                    prevNode[nextNode] = node;
                }
                if (nextNode != 1 && edges[nextNode] == 0) {
                    queue.offer(new Node(nextNode, result[nextNode]));
                }
            }
        }

        sb.append(result[1]).append("\n");

        boolean[] visited = new boolean[N + 1];
        int index = 1;
        int[] resultNodes = new int[N];
        resultNodes[N - 1] = 1;
        int i = N - 2;
        while (!visited[index]) {
            visited[index] = true;
            resultNodes[i--] = prevNode[index];
            index = prevNode[index];
        }

        for (int node : resultNodes) {
            if (node != 0) {
                sb.append(node).append(" ");
            }
        }
        sb.append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
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
