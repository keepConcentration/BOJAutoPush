import java.io.*;
import java.util.*;

class Main {

    static List<Integer>[] adjacentNodeArr;

    static StringBuilder sb = new StringBuilder();

    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        adjacentNodeArr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; ++i) {
            adjacentNodeArr[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            String[] arr = br.readLine().split(" ");
            int startNode = Integer.parseInt(arr[0]);
            int endNode = Integer.parseInt(arr[1]);

            adjacentNodeArr[startNode].add(endNode);
            adjacentNodeArr[endNode].add(startNode);
        }

        sb.append(bfs(1));

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            List<Integer> adjacentNodeList = adjacentNodeArr[poll];

            for (int i = 0; i < adjacentNodeList.size(); ++i) {
                int next = adjacentNodeList.get(i);
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }
        return count;
    }
}