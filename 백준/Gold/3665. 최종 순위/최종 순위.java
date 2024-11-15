import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static List<Integer>[] adjacencyList;

    static int[] edges;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = parseInt(br.readLine());

        t:
        while (T-- > 0) {
            int N = parseInt(br.readLine());

            adjacencyList = new ArrayList[N + 1];
            edges = new int[N + 1];
            for (int i = 1; i <= N; ++i) {
                adjacencyList[i] = new ArrayList<>();
                edges[i] = 0;
            }

            String[] strArr = br.readLine().split(" ");
            for (int i = 0; i < N - 1; ++i) {
                int startNode = parseInt(strArr[i]);
                for (int j = i + 1; j < N; ++j) {
                    int endNode = parseInt(strArr[j]);
                    adjacencyList[startNode].add(endNode);
                    edges[endNode]++;
                }
            }

            int M = parseInt(br.readLine());
            for (int i = 0; i < M; ++i) {
                strArr = br.readLine().split(" ");
                Integer startNode = parseInt(strArr[0]);
                Integer endNode = parseInt(strArr[1]);

                if (adjacencyList[startNode].contains(endNode)) {
                    boolean deleted = adjacencyList[startNode].remove(endNode);
                    edges[endNode]--;
                } else {
                    adjacencyList[startNode].add(endNode);
                    edges[endNode]++;
                }
                if (adjacencyList[endNode].contains(startNode)) {
                    boolean deleted = adjacencyList[endNode].remove(startNode);
                    edges[startNode]--;
                } else {
                    adjacencyList[endNode].add(startNode);
                    edges[startNode]++;
                }
            }

            if (Arrays.stream(edges).distinct().count() != N) {
                sb.append("IMPOSSIBLE\n");
                continue t;
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= N; ++i) {
                if (edges[i] == 0) {
                    queue.offer(i);
                }
            }

            String str = "";
            while (!queue.isEmpty()) {
                if (queue.size() > 1) {
                    sb.append("IMPOSSIBLE\n");
                    continue t;
                }
                int poll = queue.poll();
                str += poll + " ";

                for (int adjacencyNode : adjacencyList[poll]) {
                    edges[adjacencyNode]--;
                    if (edges[adjacencyNode] == 0) {
                        queue.offer(adjacencyNode);
                    }
                }
            }
            sb.append(str).append("\n");

        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}