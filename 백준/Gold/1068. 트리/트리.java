import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer>[] adjacencyList;
    static boolean[] visited;
    static int deleteNode = -1;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        int N = parseInt(br.readLine());
        adjacencyList = new ArrayList[N];
        visited = new boolean[N];
        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            adjacencyList[i] = new ArrayList<>();
        }
        int root = -1;
        for (int i = 0; i < N; ++i) {
            int in = parseInt(strArr[i]);

            if (in == -1) {
                root = i;
            } else {
                adjacencyList[in].add(i);
            }
        }

        deleteNode = parseInt(br.readLine());

        dfs(root);

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int n) {
        if (n == deleteNode) {
            return;
        }
        if (visited[n]) {
            return;
        }
        visited[n] = true;
        if (adjacencyList[n].isEmpty() || adjacencyList[n].size() == 1 && adjacencyList[n].get(0) == deleteNode) {
            result++;
            return;
        }

        for (int adjacencyNode : adjacencyList[n]) {
            dfs(adjacencyNode);
        }
    }

}
