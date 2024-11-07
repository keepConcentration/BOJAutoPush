import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] edgeArr;
    static List<Integer>[] adjacencyList;

    static int[] times;

    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        edgeArr = new int[N + 1];
        adjacencyList = new ArrayList[N + 1];
        times = new int[N + 1];
        result = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; ++i) {
            String[] strArr = br.readLine().split(" ");
            times[i] = parseInt(strArr[0]);

            for (int j = 1; j < strArr.length - 1; ++j) {
                adjacencyList[parseInt(strArr[j])].add(i);
                edgeArr[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; ++i) {
            if (edgeArr[i] == 0) {
                queue.offer(i);
                result[i] = times[i];
            }
        }

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            for (int adjacencyNode : adjacencyList[poll]) {
                edgeArr[adjacencyNode]--;
                result[adjacencyNode] = Math.max(result[poll] + times[adjacencyNode], result[adjacencyNode]);
                if (edgeArr[adjacencyNode] == 0) {
                    queue.offer(adjacencyNode);
                }
            }
        }

        for (int i = 1; i <= N; ++i) {
            sb.append(result[i]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}