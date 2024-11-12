import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static List<int[]>[] adjacencyList;

    static int[] startEdges;
    static int[] endEnges;

    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        M = parseInt(br.readLine());

        adjacencyList = new ArrayList[N + 1];
        startEdges = new int[N + 1];
        endEnges = new int[N + 1];
        result = new int[N + 1];

        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; ++i) {
            String[] strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[1]);
            int endNode = parseInt(strArr[0]);
            int count = parseInt(strArr[2]);

            adjacencyList[endNode].add(new int[] {startNode, count});
            startEdges[startNode]++;
            endEnges[endNode]++;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {N, 1});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curNode = poll[0];
            int multiple = poll[1];
            for (int[] adjacencyNode : adjacencyList[curNode]) {
                int node = adjacencyNode[0];
                int count = adjacencyNode[1] * multiple;
                startEdges[node]--;
                result[node] += count;
                if (startEdges[node] == 0) {
                    queue.offer(new int[] {node, result[node]});
                }
            }
        }

        for (int i = 1; i <= N; ++i) {
            if (endEnges[i] == 0) {
                sb.append(i).append(" ").append(result[i]).append("\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}