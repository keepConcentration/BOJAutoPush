import java.io.*;
import java.util.*;

class Main {

    static List<Integer>[] adjacentNodeArr;

    static int N, M, R;

    static int[] visited;

    static int visitedCount = 1;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");

        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);
        R = Integer.parseInt(arr[2]);

        visited = new int[N + 1];

        adjacentNodeArr = new ArrayList[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacentNodeArr[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; ++i) {
            arr = br.readLine().split(" ");
            int startNode = Integer.parseInt(arr[0]);
            int endNode = Integer.parseInt(arr[1]);
            adjacentNodeArr[startNode].add(endNode);
            adjacentNodeArr[endNode].add(startNode);
        }

        for (int i = 1; i <= N; ++i) {
            adjacentNodeArr[i].sort((o1, o2) -> o2 - o1);
        }

        bfs(R);

        for (int i = 1; i <= N; ++i) {
            sb.append(visited[i]).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int n) {
        if (visited[n] != 0) {
            return;
        }
        visited[n] = visitedCount;
        visitedCount++;
        List<Integer> adjacentNodeList = adjacentNodeArr[n];
        for (int node : adjacentNodeList) {
            dfs(node);
        }
    }

    private static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = visitedCount++;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            List<Integer> adjacentNodeList = adjacentNodeArr[poll];
            for (int i = 0; i < adjacentNodeList.size(); ++i) {
                int next = adjacentNodeList.get(i);
                if (visited[next] == 0) {
                    visited[next] = visitedCount++;
                    queue.offer(next);
                }
            }
        }
    }
}