import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static List<Integer>[] adjacencyList;

    static int[] edgeArr;

    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");

        N = parseInt(strArr[0]);
        int M = parseInt(strArr[1]);
        adjacencyList = new ArrayList[N + 1];
        edgeArr = new int[N + 1];
        result = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; ++i) {
            strArr = br.readLine().split(" ");
            int startNode = parseInt(strArr[0]);
            int endNode = parseInt(strArr[1]);
            adjacencyList[startNode].add(endNode);
            edgeArr[endNode]++;
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 1; i <= N; ++i) {
            if (edgeArr[i] == 0) {
                queue.offer(new int[] {i, 1});
            }
        }

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int val = poll[1];
            result[poll[0]] = val;
            for (int adjacencyNode : adjacencyList[poll[0]]) {
                edgeArr[adjacencyNode]--;
                if (edgeArr[adjacencyNode] == 0) {
                    queue.offer(new int[] {adjacencyNode, result[poll[0]] + 1});
                }
            }
        }

        for (int i = 1; i <= N; ++i) {
            sb.append(result[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1).append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}