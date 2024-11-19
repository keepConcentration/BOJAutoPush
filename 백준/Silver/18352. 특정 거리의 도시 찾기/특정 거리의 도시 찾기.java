import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;

    static List<Integer>[] adjacencyList;

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] strArr = br.readLine().split(" ");

        N = parseInt(strArr[0]);
        int M = parseInt(strArr[1]);
        int K = parseInt(strArr[2]);
        int X = parseInt(strArr[3]);

        adjacencyList = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; ++i) {
            strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);

            adjacencyList[startNode].add(endNode);
        }

        List<Integer> result = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {X, 0});
        visited[X] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int node = poll[0];
            int count = poll[1];

            for (int adjacencyNode : adjacencyList[node]) {
                if (visited[adjacencyNode]) {
                    continue;
                }
                visited[adjacencyNode] = true;
                int nextCount = count + 1;
                if (K == nextCount) {
                    result.add(adjacencyNode);
                    continue;
                }
                queue.offer(new int[] {adjacencyNode, nextCount});
            }
        }

        Collections.sort(result);
        for (int res : result) {
            sb.append(res).append("\n");
        }
        if (result.size() == 0) {
            sb.append("-1\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
